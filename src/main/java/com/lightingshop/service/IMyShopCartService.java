package com.lightingshop.service;

import java.util.List;

import com.lightingshop.dto.ShopCartLight;

public interface IMyShopCartService {

    /**
     * 某用户（userID）添加某一商品（lightID）进购物车
     * @param lightID
     * @param userID
     * @return
     */
    int addMyShopCart(Integer lightID, Integer userID, Integer quantity);
    
    /**
     * 返回某用户的所有购物车商品
     * @param userID
     * @return
     */
    List<ShopCartLight> listMyShopCart(Integer userID);
    
    /**
     * 根据id删除购物车
     * @param listLightID
     * @return
     */
    List<Integer> deleteMyShopCart(List<Integer> listLightID, Integer userID);
    
    ShopCartLight getShopCartLight(Integer lightID, Integer userID);
}
