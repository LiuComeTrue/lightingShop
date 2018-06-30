package com.lightingshop.dao;

import java.util.List;

import com.lightingshop.entity.Brand;

public interface BrandDao {

    /**
     * 获取所有Brand（品牌）
     * @return
     */
    List<Brand> listBrand();
    
    /**
     * 获取品牌名称
     * @param brandID
     * @return
     */
    String getBrandName(Integer brandID);
}
