package com.lightingshop.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.lightingshop.dao.OrdersDao;
import com.lightingshop.dto.Msg;
import com.lightingshop.entity.Orders;
import com.lightingshop.entity.OrdersExample;
import com.lightingshop.entity.OrdersExample.Criteria;
import com.lightingshop.service.IOrderManageService;
import com.lightingshop.util.DateUtil;

@Service
public class OrderManageService implements IOrderManageService {

	@Autowired
	private OrdersDao ordersDao;
	

	
	/**
	 * 修改订单收货信息
	 */
	@Override
	public Msg saveReceive(Orders order) {
		if(order.getAddress().equals("")||order.getReceivename().equals("")||order.getReceivephone().equals("")) {
			return Msg.Fail();
		}
		else {
			ordersDao.updateByPrimaryKeySelective(order);
			return Msg.Success();
		}
	}
	
	
	/**
	 * 订单发货
	 */
	@Override
	public void Express(String id) {
		Orders orderSET = new Orders();
		orderSET.setOrderID(id);
		
		if(ordersDao.selectByPrimaryKey(id).getOrderstateid().equals(new Integer(0))) {
			orderSET.setOrderstateid(new Integer(2));
			ordersDao.updateByPrimaryKeySelective(orderSET);
			System.out.println("---发货成功---");
		}
		else {
			System.out.println("---发货失败---");
			return;
		}
	}
	
	/**
	 * 订单退货申请处理
	 */
	@Override
	public void Return(String id,int flag) {
		Orders orderSET = new Orders();
		orderSET.setOrderID(id);
		
		if(ordersDao.selectByPrimaryKey(id).getOrderstateid().equals(new Integer(1))) {
			orderSET.setOrderstateid(new Integer(flag));
			ordersDao.updateByPrimaryKeySelective(orderSET);
			System.out.println("---处理退货请求成功---");
		}
		else {
			System.out.println("---处理退货请求失败---");
			return;
		}
	}
	
	
	/**
	 * 查询订单列表包含灯信息
	 */
	@Override
	public List<Orders> getAll(Integer pn,String Type,String Key,String star,String end,String by) {
		
		System.out.println("查询type="+Type+",Key="+Key+", StartDate:"+star+", EndDate:"+end+", OrderBy:"+by);
		
		OrdersExample example = new OrdersExample();
		example.setDistinct(true);//去除重复
		example.setOrderByClause(this.changeBy(by));
		Criteria criteria = example.createCriteria();
		
		if(Type!="all"&&Key!="all") {
			if(Type.equals("orderID")) {
				criteria.andOrderIDEqualTo(Key); //查询orderID
			}else if(Type.equals("orderstateid")) {
				Integer i = this.StateNum(Key);
				if( i.equals(new Integer(-1)));
				else
					criteria.andOrderstateidEqualTo(i);//查询特定订单状态
			}else if(Type.equals("address")) {
				System.out.println("111");
				criteria.andAddressLike("%"+Key+"%");//查询LIKE地址
			}
		}
		
		Date dateStar=new Date();
		Date dateEnd=new Date();
		try {
			dateStar = DateUtil.parse("2000-1-1 00:00:00");
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		if(star.equals("all"));
		else
			try {
				dateStar =  DateUtil.parse(star+":00");
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
		if(end.equals("all"));
		else
			try {
				dateEnd =  DateUtil.parse(end+":00");
			} catch (ParseException e) {

				e.printStackTrace();
			}
		criteria.andDateBetween(dateStar,dateEnd);
		try {
			System.out.println(""+DateUtil.formatDate(dateStar)+", "+DateUtil.formatDate(dateEnd));
		} catch (ParseException e) {

			e.printStackTrace();
		}
		PageHelper.startPage(pn,15);
		List<Orders> list = ordersDao.selectByExampleWithLights(example);
		
		return list;
	}

	/**
	 *拆分出排序方法
	 */
	public String changeBy(String By) {
		if(By.length()<=4)
			return By;
		if(By.substring(By.length()-3 , By.length()).equals("ASC"))
			By = By.substring(0,By.length()-3)+"  "+By.substring(By.length()-3,By.length());
		else
			By = By.substring(0,By.length()-4)+"  "+By.substring(By.length()-4,By.length());
		return By;
	}
	
	//订单状态ID转换
	public Integer StateNum(String Key) {
		CharSequence key = Key;
		Integer i = new Integer(-1);
		String key0=new String("未发货");
		String key1=new String("申请退货中");
		String key2=new String("已发货");
		String key3=new String("已退货");
		String key4=new String("订单已取消");
		String key5=new String("下单未付款");
		if(key0.contains(key))
			i=0;
		else if(key1.contains(key))
			i=1;
		else if(key2.contains(key))
			i=2;
		else if(key3.contains(key))
			i=3;
		else if(key4.contains(key))
			i=4;
		else if(key5.contains(key))
			i=5;
		else {
			i=-1;
			System.out.println("无状态！");
		}
		return i;
	}

	/**
	 * 查询订单需要处理的数量
	 */
	@Override
	public Integer selectTips() {

		return ordersDao.selectOrdersTip();
	}
}
