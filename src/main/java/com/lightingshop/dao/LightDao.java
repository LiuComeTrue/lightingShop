package com.lightingshop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

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
    
    /**
     * 分类查询灯饰产品
     * @param list1 灯饰种类
     * @param list2 灯饰品牌
     * @param list3 灯饰风格
     * @param sort  排序规则
     * @param lowPrice 最低价格
     * @param highPrice 最高价格
     * @param m 当前页数和每页数量
     * @return
     */
    List<Light> listTypeLight(@Param("categories") List<Integer> list1, @Param("brands") List<Integer> list2, 
            @Param("styles") List<Integer> list3, @Param("sort") String sort, @Param("lowPrice") String lowPrice, 
            @Param("highPrice") String highPrice, @Param("page") Map<String, Object> m);
    
    /**
     * 按分类查询返回总页数
     * @param list1
     * @param list2
     * @param list3
     * @param lowPrice
     * @param highPrice
     * @return
     */
    String getAllPages(@Param("categories") List<Integer> list1, @Param("brands") List<Integer> list2, 
            @Param("styles") List<Integer> list3, @Param("lowPrice") String lowPrice, @Param("highPrice") String highPrice);
    
    /**
     * 根据searchMessage模糊查询灯饰产品
     * @param searchMessage
     * @return
     */
    List<Light> listSearchLight(@Param("searchMessage") String searchMessage, @Param("page") Map<String, Object> m);
    
    /**
     * 模糊查询总页数
     * @param searchMessage
     * @return
     */
    String getSearchPages(String searchMessage);
    
    /**
     * 查询某一商品描述的图片地址
     * @param lightID
     * @return
     */
    String getLightDescriptionImage(Integer lightID);
}
