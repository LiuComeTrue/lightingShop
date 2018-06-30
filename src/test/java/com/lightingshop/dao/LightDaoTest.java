package com.lightingshop.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
    @Test
    public void test3() {
        System.out.println("Type Test");
        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList();
        list2.add(4);
        list2.add(2);
        list2.add(5);
        List<Integer> list3 = new ArrayList();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        //list2 = null;
        list3 = null;
        String sort = "1";
        Map<String, Object> m = new HashMap<>();
        m.put("currentIndex", 0);
        m.put("pageSize", 12);
        //System.out.println("Type Test");
        List<Light> list = lightDao.listTypeLight(list1, list2, list3, sort, "40", "475", m);
        System.out.println("Type Test");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
