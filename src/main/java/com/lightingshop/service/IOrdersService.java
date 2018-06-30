package com.lightingshop.service;

import java.math.BigDecimal;
import java.util.List;

import com.lightingshop.dto.ShopCartLight;
import com.lightingshop.entity.Orders;
import com.lightingshop.entity.User;

public interface IOrdersService {

    /**
     * 生成一条订单,返回订单ID
     * @param order
     * @return
     */
    String addOrder(List<ShopCartLight> light, Integer userID, BigDecimal totalMoney, User user);
    
    /**
     * 获取某一订单的所有商品
     * @param orderID
     * @return
     */
    List<ShopCartLight> listOrder(String orderID);
    
    /**
     * 获取某一用户所有订单
     * @param userID
     * @return
     */
    List<Orders> listOrders(Integer userID);
    
    /**
     * 取消订单，将orderstateid=4
     * @param orderID
     * @param userID
     * @return
     */
    int cancelOrder(String orderID, int status);
}
