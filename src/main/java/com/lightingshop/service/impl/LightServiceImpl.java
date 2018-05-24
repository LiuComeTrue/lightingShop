package com.lightingshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.LightDao;
import com.lightingshop.entity.Light;
import com.lightingshop.service.ILightService;

@Service
public class LightServiceImpl implements ILightService {

    @Autowired
    private LightDao lightDao;
    
    @Override
    public List<Light> listNewLight() {
        // TODO Auto-generated method stub
        return lightDao.listNewLight();
    }

}
