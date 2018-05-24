package com.lightingshop.dao;

import com.lightingshop.entity.WishList;

public interface WishListDao {

    /**
     * 收藏夹添加一个灯饰
     * @param wishList
     * @return
     */
    int addWishList(WishList wishList);
}
