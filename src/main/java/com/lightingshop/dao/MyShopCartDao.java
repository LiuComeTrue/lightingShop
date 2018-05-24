package com.lightingshop.dao;

import com.lightingshop.entity.MyShopCart;

public interface MyShopCartDao {

    /**
     * 购物车添加一个灯饰
     * @param myShopCart
     * @return
     */
    int addMyShopCart(MyShopCart myShopCart);
}
