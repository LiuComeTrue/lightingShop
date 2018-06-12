package com.lightingshop.dao;

import com.lightingshop.entity.Orders;
import com.lightingshop.entity.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersDao {
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(String orderid);

    //不能插入postfee字段，会报错
    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);
    
    List<Orders> selectByExampleWithLights(OrdersExample example);

    Orders selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    
    int updateOrderStatus(String orderID, int status);
    
    /**
     * 查询需要处理的订单
     * @return
     */
    Integer selectOrdersTip();
}