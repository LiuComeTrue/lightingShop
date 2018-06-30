package com.lightingshop.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lightingshop.base.BaseTest;
import com.lightingshop.entity.BestLight;

public class BestLightDaoTest extends BaseTest {

    @Autowired
    private BestLightDao bestLightDao;
    
    @Autowired
    private BestLight bestLight;
    
    @Test
    public void test() {
        bestLight = bestLightDao.listBestLight().get(0);
        System.out.println(bestLight);
    }
    
}
