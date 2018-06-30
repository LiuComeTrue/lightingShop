package com.lightingshop.serviceimpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lightingshop.base.BaseTest;
import com.lightingshop.dto.ShopCartLight;
import com.lightingshop.entity.Orders;
import com.lightingshop.service.IOrdersService;

public class OrderImplTest extends BaseTest {

    @Autowired
    private IOrdersService ordersService;
    
    @Autowired
    private ShopCartLight shopCartLight;
    
    @Test
    public void test() {
        
        List<ShopCartLight> light = new ArrayList<>();
        shopCartLight.setBrand("1");
        shopCartLight.setImage("img/1");
        shopCartLight.setLightID(101);
        shopCartLight.setLightName("1");
        BigDecimal a = new BigDecimal(100);
        shopCartLight.setPrice(a);
        shopCartLight.setQuantity(3);
        shopCartLight.setStock(5);
        light.add(shopCartLight);
        Integer userID = 101;
        BigDecimal totalMoney = new BigDecimal(100);
        //ordersService.addOrder(light, userID, totalMoney);
    }
    
    @Test
    public void test1() {
        Integer userID = 101;
        List<Orders> list = ordersService.listOrders(userID);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getOrderID());
            System.out.println(list.get(i).getLights().get(0).getLightID());
        }
    }
}
