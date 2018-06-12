package com.lightingshop.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lightingshop.base.BaseTest;
import com.lightingshop.entity.OrderLights;
import com.lightingshop.entity.Orders;

public class OrdersDaoTest extends BaseTest {

    @Autowired
    private OrdersDao ordersDao;
    
    @Autowired
    private OrderLightsDao orderLightsDao;
    
    @Autowired
    private Orders order;
    
    @Autowired
    private OrderLights orderLights;
    
    @Test
    public void test() {
        order.setOrderID("111");
        order.setUserID(101);
        BigDecimal a = new BigDecimal(100);
        order.setTotalprice(a);
        order.setDate("2018-06-05 20:32:19");
        order.setOrderstateid(1);        
        order.setAddress("1");
        order.setEmail("1");
        order.setPaymenttype("1");
        order.setPostalcode("1");
        BigDecimal b = new BigDecimal(100);
        //order.setPostfee(b);
        order.setPosttype("1");
        order.setReceivename("1");
        order.setReceivephone("1");
        order.setShowornot(1);
        
        ordersDao.insert(order);
        
        orderLights.setLightID(101);
        orderLights.setOrderID("111");
        orderLights.setQuantity(3);
        orderLights.setSingleprice(a);
        List<OrderLights> list = new ArrayList<>();
        orderLightsDao.insert(orderLights);
        
    }
}
