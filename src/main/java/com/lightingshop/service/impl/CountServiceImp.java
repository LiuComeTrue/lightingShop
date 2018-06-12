package com.lightingshop.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.CountDao;
import com.lightingshop.dto.Count;
import com.lightingshop.dto.OrderLightCount;
import com.lightingshop.service.ICountService;

@Service
public class CountServiceImp implements ICountService{

	@Autowired
	private CountDao countDao;
	
	@Autowired
	private Count count;
	
	/**
	 * 按照时间段查询销售量
	 */
	@Override
	public List<OrderLightCount> setCountLight(Integer month) {
		
		return countDao.selectCountLightByDate(month+1,0);
	}


	/**
	 * 按照时间段查询销售额
	 */
	@Override
	public Count setCountPrice() {
		
		List<String> id = new ArrayList();
		List<String> num = new ArrayList();
		
		for(Integer i=5 ; i>=1 ; i--) {
			BigDecimal k = countDao.selectCountPriceByDate(i+1, i);
			id.add((i).toString()+"月前");
			if(k==null)
				num.add("0");
			else
				num.add(k.toString());
		}
		BigDecimal k = countDao.selectCountPriceByDate(1, 0);
		id.add("当月");
		num.add(k.toString());
		count.setLightID(id);
		count.setSum(num);
		return count;
	}

}
