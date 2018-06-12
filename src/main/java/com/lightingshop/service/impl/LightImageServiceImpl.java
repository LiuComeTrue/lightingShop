package com.lightingshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.LightImageDao;
import com.lightingshop.entity.LightImage;
import com.lightingshop.service.ILightImageService;

@Service
public class LightImageServiceImpl implements ILightImageService {

    @Autowired
    private LightImageDao lightImageDao;
    
    @Override
    public List<LightImage> listLightImage(Integer lightID) {
        // TODO Auto-generated method stub
        return lightImageDao.listLightImage(lightID);
    }

}
