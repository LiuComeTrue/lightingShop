package com.lightingshop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lightingshop.dto.Msg;
import com.lightingshop.entity.Orders;
import com.lightingshop.service.IOrderManageService;


@Controller
public class OrderManageController {

	@Autowired
	private IOrderManageService orderManageService;
	
	/**
	 *更新订单列表
	 * @return
	 */
	@RequestMapping("/OrderManageList/{pn}/{type}/{key}/{star}/{end}/{by}")
    @ResponseBody
	public PageInfo getOrdersWithJson(@PathVariable Integer pn, @PathVariable String type,@PathVariable String key,
			@PathVariable String star, @PathVariable String end,@PathVariable String by){
		
		System.out.println(""+type+", "+key+", "+star+", "+end);
		List<Orders> orders = orderManageService.getAll(pn,type,key,star,end,by);

		PageInfo page = new PageInfo(orders);
		System.out.println("pageSize:" + page.getPageSize());  
		return page;
	}
	
	/**
	 * 发货
	 * @param id
	 * @return
	 */
	@RequestMapping("/UpateOrder/express/{id}")
    @ResponseBody
	public Msg OrderUpdateExpress(@PathVariable String id){
		
		orderManageService.Express(id);
		return Msg.Success();
	}
	
	/**
	 * 处理退货申请
	 * @param id
	 * @return
	 */
	@RequestMapping("/UpateOrder/return/{id}/{flag}")
    @ResponseBody
	public Msg OrderUpdateReturn(@PathVariable String id,@PathVariable int flag){
		
		orderManageService.Return(id,flag);
		return Msg.Success();
	}
	
	/**
	 * 修改订单收货信息
	 * @param order
	 * @return
	 */
	@RequestMapping("/SaveReceive")
    @ResponseBody
	public Msg saveReceive(Orders order) {
		Msg msg = orderManageService.saveReceive(order);
		return msg;
	}
	
	/**
	 * 
	 */
	@RequestMapping("/ordersTips")
	@ResponseBody
	public Integer OrdersTip () {
		return orderManageService.selectTips();
	}
}
