package com.lightingshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.StyleDao;
import com.lightingshop.entity.Style;
import com.lightingshop.service.IStyleService;

@Service
public class StyleServiceImpl implements IStyleService{

    @Autowired
    private StyleDao styleDao;
    
    @Override
    public List<Style> listStyle() {
        // TODO Auto-generated method stub
        return styleDao.listStyle();
    }

}
