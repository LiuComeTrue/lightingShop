package com.lightingshop.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lightingshop.dao.LightDao;
import com.lightingshop.dao.OrderLightsDao;
import com.lightingshop.dao.OrdersDao;
import com.lightingshop.dto.ShopCartLight;
import com.lightingshop.entity.Light;
import com.lightingshop.entity.OrderLights;
import com.lightingshop.entity.Orders;
import com.lightingshop.entity.OrdersExample;
import com.lightingshop.entity.OrdersExample.Criteria;
import com.lightingshop.service.IOrdersService;
import com.lightingshop.util.DateUtil;

@Service
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private OrdersDao ordersDao;
    
    @Autowired
    private OrderLightsDao orderLightsDao;
    
    @Autowired
    private Orders order;
    
    @Autowired
    private OrderLights orderLights;

    @Transactional
    @Override
    public String addOrder(List<ShopCartLight> light, Integer userID, BigDecimal totalMoney) {
        // TODO Auto-generated method stub
        UUID uuid = UUID.randomUUID();
        String orderID = uuid.toString();
        order.setOrderID(orderID);
        order.setUserID(userID);
        order.setTotalprice(totalMoney);
        String nowDate = null;
        try {
            nowDate = DateUtil.formatDate(new Date());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        order.setDate(nowDate);
        System.out.println("nowDate: " + nowDate);
        order.setOrderstateid(5);     
        
        ordersDao.insert(order);
        
        OrderLights orderLights;
        for (int i = 0; i < light.size(); i++) {
            orderLights = new OrderLights();
            orderLights.setOrderID(orderID);
            orderLights.setLightID(light.get(i).getLightID());            
            orderLights.setQuantity(light.get(i).getQuantity());
            orderLights.setSingleprice(light.get(i).getPrice());
            orderLightsDao.insert(orderLights);
        }     
        return orderID;
    }

    @Autowired
    private LightDao lightDao;
    
    @Autowired
    private Light light;
    
    @Override
    public List<ShopCartLight> listOrder(String orderID) {
        // TODO Auto-generated method stub
        List<ShopCartLight> result = new ArrayList<>();
        List<OrderLights> listOrderLights = orderLightsDao.listOrderLights(orderID);
        ShopCartLight shopCartLight;
        for(int i = 0; i < listOrderLights.size(); i++) {
            shopCartLight = new ShopCartLight();
            light = lightDao.getLightByID(listOrderLights.get(i).getLightID());
            shopCartLight.setImage(light.getImages());
            shopCartLight.setLightName(light.getLightName());
            shopCartLight.setQuantity(listOrderLights.get(i).getQuantity());
            shopCartLight.setPrice(listOrderLights.get(i).getSingleprice());
            shopCartLight.setLightID(listOrderLights.get(i).getLightID());
            result.add(shopCartLight);
        }       
        return result;
    }    
    
    @Override
    public List<Orders> listOrders(Integer userID) {
        
        OrdersExample example = new OrdersExample();     
        Criteria criteria = example.createCriteria();        
        criteria.andUserIDEqualTo(userID);                
        List<Orders> list = ordersDao.selectByExampleWithLights(example);
        String lightNames = "";
        String name;
        for (int i = 0; i < list.size(); i++) {
            order = list.get(i);
            List<OrderLights> listorderLights = order.getLights();
            for (int j = 0; j < listorderLights.size(); j++) {
                name = lightDao.getLightByID(listorderLights.get(j).getLightID()).getLightName();
                lightNames += (name + "|");
            }
            order.setLightNames(lightNames);
        }
        return list;
    }

    @Override
    public int cancelOrder(String orderID, int status) {
        // TODO Auto-generated method stub
        return ordersDao.updateOrderStatus(orderID, status);
    }

}
