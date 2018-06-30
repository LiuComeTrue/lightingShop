package com.lightingshop.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lightingshop.dto.LightDescription;
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
    
    /**
     * 分类查询灯饰产品
     * @param listCategories
     * @param listBrands
     * @param listStyles
     * @param sort
     * @param lowPrice
     * @param highPrice
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<Light> listTypeLight(List<Integer> listCategories, List<Integer> listBrands, 
            List<Integer> listStyles, String sort, String lowPrice, String highPrice, 
            Integer currentPage, Integer pageSize);
    
    /**
     * 按分类查询返回总页数
     * @param list1
     * @param list2
     * @param list3
     * @param lowPrice
     * @param highPrice
     * @return
     */
    String getAllPages(List<Integer> list1, List<Integer> list2, List<Integer> list3, String lowPrice, String highPrice);
    
    /**
     * 模糊查询
     * @param searchMessage
     * @return
     */
    List<Light> listSearchLight(String searchMessage, Integer currentPage, Integer pageSize);
    
    /**
     * 模糊查询总页数
     * @param searchMessage
     * @return
     */
    String getSearchPages(String searchMessage);
    
    /**
     * 获取某一灯饰的详情信息，封装为LightDescription
     * @return
     */
    LightDescription getLightDescription(Integer lightID);
    
    /**
     * 获取商品描述图片地址
     * @param lightID
     * @return
     */
    String getLightDescriptionImage(Integer lightID);
    
}
