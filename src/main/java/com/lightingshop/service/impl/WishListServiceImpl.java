package com.lightingshop.service.impl;

import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.WishListDao;
import com.lightingshop.entity.WishList;
import com.lightingshop.service.IWishListService;
import com.lightingshop.util.DateUtil;

@Service
public class WishListServiceImpl implements IWishListService {

    @Autowired
    private WishList wishList;
    
    @Autowired
    private WishListDao wishListDao;
    
    @Override
    public int addWishList(Integer lightID, Integer userID) {
        // TODO Auto-generated method stub
        wishList.setLightID(lightID);
        wishList.setUserID(userID);
        String nowDate = null;
        try {
            nowDate = DateUtil.formatDate(new Date());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        wishList.setStoreDate(nowDate);
        
        return wishListDao.addWishList(wishList);
    }

}
