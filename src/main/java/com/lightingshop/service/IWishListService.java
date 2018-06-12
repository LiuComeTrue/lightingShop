package com.lightingshop.service;

import java.util.List;

import com.lightingshop.dto.WishListTable;
import com.lightingshop.entity.WishList;

public interface IWishListService {

    /**
     * 某用户（userID）添加某一商品（lightID）进收藏夹
     * @param lightID
     * @param userID
     * @return
     */
    int addWishList(Integer lightID, Integer userID);
    
    /**
     * 取出该用户的收藏夹商品封装成WishListTable
     * @param userID
     * @return
     */
    List<WishListTable> listWishtList(Integer userID);
    
    /**
     * 删除收藏夹一件商品
     * @param lightID
     * @return
     */
    int deleteWishList(Integer lightID, Integer userID);
}
