package com.lightingshop.dao;

import java.util.List;

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
    
    @Test
    public void test1() {
        System.out.println("listWishList Test");
        List<WishList> list = wishListDao.listWishList(101);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getLightID());
        }
    }
}
