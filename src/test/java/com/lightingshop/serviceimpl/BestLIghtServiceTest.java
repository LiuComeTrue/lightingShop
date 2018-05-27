package com.lightingshop.serviceimpl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lightingshop.base.BaseTest;
import com.lightingshop.entity.BestLight;
import com.lightingshop.entity.Light;
import com.lightingshop.service.IBestLightService;

public class BestLIghtServiceTest extends BaseTest {

    @Autowired
    private IBestLightService bestLightService;
    
    @Autowired
    private BestLight bestLight;
    
    @Autowired
    private Light light;
    
    @Test
    public void test() {
        List<Light> list = null;
        list = bestLightService.listBestLight();
        for (int i = 0; i < list.size(); i++) 
            System.out.println(list.get(i));
    }
}
