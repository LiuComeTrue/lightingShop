package com.lightingshop.service.impl;

import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.MyShopCartDao;
import com.lightingshop.entity.MyShopCart;
import com.lightingshop.service.IMyShopCartService;
import com.lightingshop.util.DateUtil;

@Service
public class MyShopCartImpl implements IMyShopCartService {

    @Autowired
    private MyShopCart myShopCart;
    
    @Autowired
    private MyShopCartDao myShopCartDao;
    
    @Override
    public int addMyShopCart(Integer lightID, Integer userID) {
        // TODO Auto-generated method stub
        myShopCart.setLightID(lightID);
        myShopCart.setUserID(userID);
        String nowDate = null;
        try {
            nowDate = DateUtil.formatDate(new Date());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        myShopCart.setAddDate(nowDate);
        return myShopCartDao.addMyShopCart(myShopCart);
    }

}
