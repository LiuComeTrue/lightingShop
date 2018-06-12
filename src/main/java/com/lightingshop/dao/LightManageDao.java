package com.lightingshop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lightingshop.entity.Light;
import com.lightingshop.entity.LightExample;
import com.lightingshop.entity.LightImage;

public interface LightManageDao {
	
	/**
	 * 查询灯饰信息包含类别
	 * @param example
	 * @return
	 */
    List<Light> listLight(LightExample example);
    
    /**
     * 插入灯饰，返回light接收主键ID
     * @param light
     */
    void insertSelective(Light light);
    
    /**
     * 插入灯饰轮播图
     * @param lightImage
     */
    void InsertAllImages(LightImage lightImage);
    
    /**
     * 插入灯饰信息详情图
     * @param lightImage
     */
    void InsertImageInfo(LightImage lightImage);
    
    /**
     * 修改灯饰信息
     * @param light
     */
    void updateByPrimaryKeySelective(Light light);
    
    Integer selectLightTips();
    
}
