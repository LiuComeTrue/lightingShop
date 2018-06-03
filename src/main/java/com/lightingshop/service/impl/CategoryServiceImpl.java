package com.lightingshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.CategoryDao;
import com.lightingshop.dao.LightDao;
import com.lightingshop.entity.Category;
import com.lightingshop.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryDao categoryDao;
    
    @Override
    public List<Category> listCategory() {
        // TODO Auto-generated method stub
        return categoryDao.listCategory();
    }

}
