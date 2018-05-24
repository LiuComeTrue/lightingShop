package com.lightingshop.serviceimpl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lightingshop.base.BaseTest;
import com.lightingshop.service.IWishListService;


public class WishListServiceTest extends BaseTest{

    @Autowired
    public IWishListService wishListService;
    
    @Test
    public void test() {
        int result = wishListService.addWishList(101, 102);
        System.out.println(result);
    }
}
