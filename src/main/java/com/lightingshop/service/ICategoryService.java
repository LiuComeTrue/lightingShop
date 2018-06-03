package com.lightingshop.service;

import java.util.List;

import com.lightingshop.entity.Category;

public interface ICategoryService {

    /**
     * 获取category表所有数据
     * @return
     */
    List<Category> listCategory();
    
    //List<Light> listCategoryLight(List<Integer> listCategories,  Integer currentPage, Integer pageSize);
}
