package com.lightingshop.dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lightingshop.base.BaseTest;
import com.lightingshop.entity.MyShopCart;
import com.lightingshop.util.DateUtil;

public class MyShopCartDaoTest extends BaseTest {

    @Autowired
    private MyShopCartDao myShopCartDao;
    
    @Autowired
    private MyShopCart myShopCart;
    
    @Test
    public void test() {
        myShopCart.setLightID(101);
        myShopCart.setUserID(101);
        String nowDate = null;
        try {
            nowDate = DateUtil.formatDate(new Date());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        myShopCart.setAddDate(nowDate);
        myShopCartDao.addMyShopCart(myShopCart);
    }
    
    @Test
    public void test1() {
        int i = myShopCartDao.shopCartExist(1, 1);
        System.out.println(i);
    }
    
    @Test
    public void test2() {
        myShopCart.setLightID(101);
        myShopCart.setUserID(101);
        myShopCart.setQuantity(3);
        int i = myShopCartDao.updateMyShopCart(myShopCart);
        System.out.println(i);
    }
    
    @Test
    public void test3() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(101);
        list.add(102);
        int i = myShopCartDao.deleteMyShopCart(list, 101);
        System.out.println(i);
    }
    
}
