package com.lightingshop.service;

import com.lightingshop.entity.WishList;

public interface IWishListService {

    /**
     * 某用户（userID）添加某一商品（lightID）进收藏夹
     * @param lightID
     * @param userID
     * @return
     */
    int addWishList(Integer lightID, Integer userID);
}
