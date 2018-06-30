package com.lightingshop.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lightingshop.entity.OrderLights;

public interface OrderLightsDao {
    

    int insert(OrderLights record);
    
    /**
     * 查询某一订单的所有商品
     * @return
     */
    List<OrderLights> listOrderLights(String orderID);
 
}