package com.lightingshop.service;

import java.util.List;

import com.lightingshop.dto.Msg;
import com.lightingshop.entity.Orders;

public interface IOrderManageService {

	/**
     * 订单管理中查询所有订单信息列表
	 *@param pn 页数 type搜索类型 star开始日期 end结束日期
     * @return
	 */
	List<Orders> getAll(Integer pn,String type,String key,String star,String end,String by);
	
	/**
	 * change
	 */
	String changeBy(String By);

	void Express(String id);

	void Return(String id,int flag);

	Msg saveReceive(Orders order);

	Integer selectTips();
}
