package com.lightingshop.dao;

import java.util.List;

import com.lightingshop.entity.Category;

public interface CategoryDao {

    /**
     * 获取category表所有数据
     * @return
     */
    List<Category> listCategory();
    
    /**
     * 获取分类名称
     * @param categoryID
     * @return
     */
    String getCategoryName(Integer categoryID);
}
