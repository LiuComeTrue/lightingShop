package com.lightingshop.dao;

import java.util.List;

import com.lightingshop.entity.Category;

public interface CategoryDao {

    /**
     * 获取category表所有数据
     * @return
     */
    List<Category> listCategory();
}
