package com.lightingshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lightingshop.entity.MyShopCart;

public interface MyShopCartDao {

    /**
     * 购物车添加灯饰
     * @param myShopCart
     * @return
     */
    int addMyShopCart(MyShopCart myShopCart);
    
    /**
     * 查询购物车是否存在此灯饰产品
     * @param lightID
     * @param userID
     * @return
     */
    int shopCartExist(Integer lightID, Integer userID);
    
    /**
     * 更新购物车某一灯饰的数量
     * @param myShopCart
     * @return
     */
    int updateMyShopCart(MyShopCart myShopCart);
    
    /**
     * 查询这个用户购物车所有商品
     * @param userID
     * @return
     */
    List<MyShopCart> listShopCartLight(Integer userID);
    
    /**
     * 删除购物车
     * @param listLightID
     * @return
     */
    int deleteMyShopCart(@Param("lightID") List<Integer> listLightID, @Param("userID") Integer userID);
}
