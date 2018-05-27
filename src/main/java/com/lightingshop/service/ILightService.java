package com.lightingshop.service;

import java.util.List;

import com.lightingshop.entity.Light;

public interface ILightService {

    /**
     * 获取最新添加的灯饰产品
     * @return
     */
    List<Light> listNewLight();
    
    /**
     * 获取销量前三的灯饰产品
     * @return
     */
    List<Light> listTopSeller();
    
    /**
     * 获取评分排前三的灯饰产品
     * @return
     */
    List<Light> listRated();
    
    /**
     * 分页查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<Light> listLight(Integer currentPage, Integer pageSize);
    
}
