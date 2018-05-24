package com.lightingshop.dao;

import java.text.ParseException;
import java.util.Date;

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
}
