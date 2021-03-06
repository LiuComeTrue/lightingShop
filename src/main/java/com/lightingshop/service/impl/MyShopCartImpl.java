package com.lightingshop.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.BrandDao;
import com.lightingshop.dao.LightDao;
import com.lightingshop.dao.MyShopCartDao;
import com.lightingshop.dto.ShopCartLight;
import com.lightingshop.entity.Light;
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
    public int addMyShopCart(Integer lightID, Integer userID, Integer quantity) {
        // TODO Auto-generated method stub
        myShopCart.setLightID(lightID);
        myShopCart.setUserID(userID);
        myShopCart.setQuantity(quantity);
        String nowDate = null;
        try {
            nowDate = DateUtil.formatDate(new Date());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        myShopCart.setAddDate(nowDate);
        
        int exist = myShopCartDao.shopCartExist(lightID, userID);
        if (exist == 0) {
            myShopCartDao.addMyShopCart(myShopCart);
            return myShopCart.getLightID();
        }
        else {
            myShopCartDao.updateMyShopCart(myShopCart);
            return myShopCart.getLightID();
        }
    }

    //@Autowired
    //private ShopCartLight shopCartLight;
    
    @Autowired
    private Light light;
    
    @Autowired
    private LightDao lightDao;
    
    @Autowired
    private BrandDao brandDao;
    
    @Override
    public List<ShopCartLight> listMyShopCart(Integer userID) {
        // TODO Auto-generated method stub
        List<ShopCartLight> listCartLight = new ArrayList<ShopCartLight>();
        List<MyShopCart> listLight = myShopCartDao.listShopCartLight(userID);
        Integer lightID = 0;
        ShopCartLight shopCartLight;
        for (int i = 0; i < listLight.size(); i++) {
            /*shopCartLight = new ShopCartLight();
            lightID = listLight.get(i).getLightID();
            light = lightDao.getLightByID(lightID);
            shopCartLight.setLightID(lightID);
            shopCartLight.setLightName(light.getLightName());
            shopCartLight.setImage(light.getImages());
            shopCartLight.setPrice(light.getPrice());
            shopCartLight.setQuantity(light.getQuantity());
            shopCartLight.setStock(light.getQuantity());
            shopCartLight.setQuantity(listLight.get(i).getQuantity());
            String brand = brandDao.getBrandName(light.getBrandID());            
            shopCartLight.setBrand(brand);
            System.out.println(shopCartLight.toString());
            listCartLight.add(shopCartLight);*/
            lightID = listLight.get(i).getLightID();
            listCartLight.add(getShopCartLight(lightID, userID));
        }
        return listCartLight;
    }

    @Override
    public List<Integer> deleteMyShopCart(List<Integer> listLightID, Integer userID) {
        // TODO Auto-generated method stub
        
        myShopCartDao.deleteMyShopCart(listLightID, userID);
        return listLightID;
    }
    
    //获取某用户购物车里某件商品的信息
    @Override
    public ShopCartLight getShopCartLight(Integer lightID, Integer userID) {
        
        System.out.println("==========" + lightID + "===" + userID);
        System.out.println(myShopCartDao);
        List<MyShopCart> listLight = myShopCartDao.listShopCartLight(userID);
        Integer Quantity = 1;
        for (MyShopCart a : listLight) {
            if (a.getLightID().equals(lightID))
                Quantity = a.getQuantity();                
        }
        
        ShopCartLight shopCartLight = new ShopCartLight();
        light = lightDao.getLightByID(lightID);
        shopCartLight.setLightID(lightID);
        shopCartLight.setLightName(light.getLightName());
        shopCartLight.setImage(light.getImages());
        shopCartLight.setPrice(light.getPrice());
        shopCartLight.setQuantity(light.getQuantity());
        shopCartLight.setStock(light.getQuantity());
        shopCartLight.setQuantity(Quantity);
        String brand = brandDao.getBrandName(light.getBrandID());            
        shopCartLight.setBrand(brand);
        return shopCartLight;
    }

}
