package com.lightingshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.BrandDao;
import com.lightingshop.entity.Brand;
import com.lightingshop.service.IBrandService;

@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    private BrandDao brandDao;
    
    @Override
    public List<Brand> listBrand() {
        // TODO Auto-generated method stub
        return brandDao.listBrand();
    }

}
