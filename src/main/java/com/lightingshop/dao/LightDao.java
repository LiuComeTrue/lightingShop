package com.lightingshop.dao;

import java.util.List;
import java.util.Map;

import com.lightingshop.entity.BestLight;
import com.lightingshop.entity.Light;

public interface LightDao {

    /**
     * 获取最新添加（前5个）的灯饰产品
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
     * 获取lightID为id的灯饰产品
     * @param id
     * @return
     */
    Light getLightByID(Integer id);
    
    /**
     * 获取llistBestLight中所有lightID为id的灯饰产品，封装成List返回
     * @param list
     * @return
     */
    List<Light> getListLight(List<BestLight> listBestLight);
    
    /**
     * 通过limit函数查询符合条件的灯饰产品，实现分页效果
     * @param pagingIndex<currentIndex:开始下标，pageSize：一页大小>
     * @return
     */
    List<Light> listLight(Map<String, Object> pagingIndex);
}
