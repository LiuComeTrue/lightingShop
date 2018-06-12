package com.lightingshop.service;

import java.util.List;

import com.lightingshop.entity.Light;
import com.lightingshop.entity.LightImage;

public interface ILightManageService {

	/**
	 * 灯饰列表获取信息
	 */
	List<Light> ListLight(Integer pn,List<Integer> listCategories, List<Integer> listBrands, List<Integer> listStyles, String key, String orderBy);
	
	Integer insertLight(Light light);

	/**
	 * 灯饰轮播图
	 * @param lightImage
	 */
	void lightImage(LightImage lightImage);
	
	/**
	 * 灯饰详情图
	 * @param lightImage
	 */
	void lightInfo(LightImage lightImage);

	/**
	 * 修改灯饰信息
	 * @param light
	 */
	void UpdateLightInfo(Light light);

	Integer selectLightTips();
}
