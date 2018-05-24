package com.lightingshop.service;

public interface IMyShopCartService {

    /**
     * 某用户（userID）添加某一商品（lightID）进购物车
     * @param lightID
     * @param userID
     * @return
     */
    int addMyShopCart(Integer lightID, Integer userID);
}
