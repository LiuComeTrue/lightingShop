package com.lightingshop.service;

import java.util.List;

import com.lightingshop.entity.Brand;

public interface IBrandService {

    /**
     * 获取brand表所有数据
     * @return
     */
    List<Brand> listBrand();
}
