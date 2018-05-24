package com.lightingshop.serviceimpl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lightingshop.base.BaseTest;
import com.lightingshop.service.IMyShopCartService;

public class MyShopCartServiceTest extends BaseTest {

    @Autowired
    private IMyShopCartService myShopCartService;
    
    @Test
    public void test() {
        System.out.println(myShopCartService.addMyShopCart(101, 101));
    }
}
