package com.lightingshop.service;

import java.util.List;

import com.lightingshop.dto.Count;
import com.lightingshop.dto.OrderLightCount;

public interface ICountService {
	
	/**
	 * 获取灯饰销售量前五
	 * @return
	 */
	List<OrderLightCount> setCountLight(Integer month);

	/**
	 * 获取六个月的销售额
	 * @return
	 */
	Count setCountPrice();
}
