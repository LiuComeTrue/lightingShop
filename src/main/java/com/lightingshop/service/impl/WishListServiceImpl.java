package com.lightingshop.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.LightDao;
import com.lightingshop.dao.WishListDao;
import com.lightingshop.dto.WishListTable;
import com.lightingshop.entity.Light;
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
        if (wishListDao.getWishList(lightID, userID) > 0)
            return 1;
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

    @Autowired
    private LightDao lightDao;
    
    @Autowired
    private Light light;
    
    @Override
    public List<WishListTable> listWishtList(Integer userID) {
        // TODO Auto-generated method stub
        List<WishListTable> result = new ArrayList<WishListTable>();
        List<WishList> list = wishListDao.listWishList(userID);
        WishListTable wishListTable;
        Integer lightID;
        for (int i = 0; i < list.size(); i++) {
            lightID = list.get(i).getLightID();
            light = lightDao.getLightByID(lightID);
            wishListTable = new WishListTable();
            wishListTable.setImage(light.getImages());
            wishListTable.setLightID(lightID);
            wishListTable.setLightName(light.getLightName());
            wishListTable.setPrice(light.getPrice());
            wishListTable.setStoreDate(list.get(i).getStoreDate());
            result.add(wishListTable);
        }       
        return result;
    }

    @Override
    public int deleteWishList(Integer lightID, Integer userID) {
        // TODO Auto-generated method stub
        return wishListDao.deleteWishList(lightID, userID);
    }

}
