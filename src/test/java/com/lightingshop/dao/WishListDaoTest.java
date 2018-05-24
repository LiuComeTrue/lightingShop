package com.lightingshop.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lightingshop.base.BaseTest;
import com.lightingshop.entity.WishList;

public class WishListDaoTest extends BaseTest {

    @Autowired
    private WishList wishList;
    
    @Autowired
    private WishListDao wishListDao;
    
    @Test
    public void test() {
        wishList.setLightID(1);
        wishList.setUserID(1);
        wishList.setStoreDate("2018-04-20 10:50:00");
        wishListDao.addWishList(wishList);
    }
}
