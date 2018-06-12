package com.lightingshop.dao;

import java.util.List;

import com.lightingshop.entity.WishList;

public interface WishListDao {

    /**
     * 收藏夹添加一个灯饰
     * @param wishList
     * @return
     */
    int addWishList(WishList wishList);
    
    /**
     * 查询该用户所有收藏夹商品
     * @param userID
     * @return
     */
    List<WishList> listWishList(Integer userID);
    
    /**
     * 删除收藏夹一件商品
     * @param lightID
     * @return
     */
    int deleteWishList(Integer lightID, Integer userID);
    
    /**
     * 查询收藏夹是否已有该商品
     * @param lightID
     * @param userID
     * @return
     */
    int getWishList(Integer lightID, Integer userID);
}
