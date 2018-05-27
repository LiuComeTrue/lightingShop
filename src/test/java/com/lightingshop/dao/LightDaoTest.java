package com.lightingshop.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lightingshop.base.BaseTest;
import com.lightingshop.entity.Light;

public class LightDaoTest extends BaseTest {

    @Autowired
    private LightDao lightDao;
    
    @Autowired
    private Light light;
    
    @Test
    public void test() {
        List<Light> lightList = lightDao.listNewLight();
        for(int i = 0; i < lightList.size(); i++) {
            light = lightList.get(i);
            System.out.println(light);
        }    
    }
    
    @Test
    public void test1() {
        light = lightDao.getLightByID(104);
        System.out.println(light);
    }
    
    @Autowired
    private BestLightDao bestLightDao;
    
    @Test
    public void test2() {
        //bestLightDao.listBestLight();
        List<Light> list = lightDao.getListLight(bestLightDao.listBestLight());
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
