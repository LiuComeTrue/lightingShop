package com.lightingshop.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.lightingshop.dao.BrandDao;
import com.lightingshop.dao.CategoryDao;
import com.lightingshop.dao.LightDao;
import com.lightingshop.dao.LightManageDao;
import com.lightingshop.entity.Brand;
import com.lightingshop.entity.Category;
import com.lightingshop.entity.Light;
import com.lightingshop.entity.LightExample;
import com.lightingshop.entity.LightExample.Criteria;
import com.lightingshop.entity.LightImage;
import com.lightingshop.service.ILightManageService;

@Service
public class LightManageServiceImpl implements ILightManageService {


    @Autowired
    private LightManageDao lightManageDao;
    
    @Autowired
    private CategoryDao categoryDao;
    
    @Autowired
   	private BrandDao brandDao;
    
    /**
     * 查询所有灯饰
     * 
     */
	@Override
	public List<Light> ListLight(Integer pn, List<Integer> listCategories, List<Integer> listBrands,
			List<Integer> listStyles , String key, String orderBy) {

        LightExample example = new LightExample();
        example.setOrderByClause("l.lightID DESC");
        example.setDistinct(true);//排除重复
        Criteria criteria = example.createCriteria();
        
        //如果有排序，加入条件
        if(!orderBy.equals("NO"))
        	example.setOrderByClause("l.quantity "+orderBy);
        //如果有按关键字查询，就加入条件
        if(!key.equals("ALL_KEY"))
        	criteria.andlightNameLike("%"+key+"%");
        
        if (listCategories == null||listCategories.size() == 0);
        else
        	criteria.andcategoryIDIn(listCategories);
        if (listBrands == null||listBrands.size() == 0);
        else
        	criteria.andbrandIDIn(listBrands);
        if (listStyles == null||listStyles.size() == 0);
        else
        	criteria.andstyleIDIn(listStyles);

		PageHelper.startPage(pn,5);
		List<Light> list = lightManageDao.listLight(example);
        return list;
	}

	/**
	 * 插入灯饰
	 * 
	 */
	@Override
	public Integer insertLight(Light light) {
		
		lightManageDao.insertSelective(light);
		
		return light.getLightID();
	}
	
	/**
	 * 插入轮播图
	 * 
	 */
	@Override
	public void lightImage(LightImage lightImage) {
		
		lightManageDao.InsertAllImages(lightImage);
		
		return;
	}

	/**
	 * 插入商品信息长图
	 * 
	 */
	@Override
	public void lightInfo(LightImage lightImage) {

		lightManageDao.InsertImageInfo(lightImage);
		
	}

	/**
	 * 修改灯饰信息
	 */
	@Override
	public void UpdateLightInfo(Light light) {
		
		lightManageDao.updateByPrimaryKeySelective(light);
		
	}

	/**
	 * 获取灯饰库存不足的数量
	 */
	@Override
	public Integer selectLightTips() {

		return lightManageDao.selectLightTips();
	}
	
}
