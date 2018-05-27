package com.lightingshop.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.BestLightDao;
import com.lightingshop.dao.LightDao;
import com.lightingshop.entity.BestLight;
import com.lightingshop.entity.Light;
import com.lightingshop.service.IBestLightService;

@Service
public class BestLightServiceImpl implements IBestLightService {

    @Autowired
    private BestLightDao bestLightDao;
    
    @Autowired
    private LightDao lightDao;
    
    @Autowired
    private BestLight bestLight;
    
    @Autowired
    private Light light;

    @Override
    public List<Light> listBestLight() {
        // TODO Auto-generated method stub
        
        List<BestLight> listBestLight = bestLightDao.listBestLight();
        return lightDao.getListLight(listBestLight);
        /*
        List<Light> listLight = new ArrayList<Light>();
        for (int i = 0; i < listBestLight.size(); i++) {
            light = lightDao.getLight(listBestLight.get(i).getLightID());
            listLight.add(light);          
        }       
        return listLight;
        */
    }    

}
