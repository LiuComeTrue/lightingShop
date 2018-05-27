package com.lightingshop.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public List<Light> listTopSeller() {
        // TODO Auto-generated method stub
        return lightDao.listTopSeller();
    }

    @Override
    public List<Light> listRated() {
        // TODO Auto-generated method stub
        return lightDao.listRated();
    }

    @Override
    public List<Light> listLight(Integer currentPage, Integer pageSize) {
        // TODO Auto-generated method stub
        Map<String, Object> pagingIndex = new HashMap<>();
        pagingIndex.put("currentIndex", (currentPage - 1) * pageSize);
        pagingIndex.put("pageSize", pageSize);
        return lightDao.listLight(pagingIndex);
    }

}
