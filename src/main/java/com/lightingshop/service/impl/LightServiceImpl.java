package com.lightingshop.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lightingshop.dao.BrandDao;
import com.lightingshop.dao.CategoryDao;
import com.lightingshop.dao.CommentDao;
import com.lightingshop.dao.LightDao;
import com.lightingshop.dao.StyleDao;
import com.lightingshop.dto.LightDescription;
import com.lightingshop.entity.Light;
import com.lightingshop.service.ILightService;

@Service
public class LightServiceImpl implements ILightService {

    @Autowired
    private LightDao lightDao;
    
    @Override
    public List<Light> listNewLight() {
        // TODO Auto-generated method stub
        return lightDao.listNewLight();
    }

    @Override
    public List<Light> listTopSeller() {
        // TODO Auto-generated method stub
        return lightDao.listTopSeller();
    }

    @Override
    public List<Light> listRated() {
        // TODO Auto-generated method stub
        return lightDao.listRated();
    }

    @Override
    public List<Light> listLight(Integer currentPage, Integer pageSize) {
        // TODO Auto-generated method stub
        Map<String, Object> pagingIndex = new HashMap<>();
        pagingIndex.put("currentIndex", (currentPage - 1) * pageSize);
        pagingIndex.put("pageSize", pageSize);
        return lightDao.listLight(pagingIndex);
    }

    @Override
    public List<Light> listTypeLight(List<Integer> listCategories, List<Integer> listBrands, List<Integer> listStyles, 
            String sort, String lowPrice, String highPrice, Integer currentPage, Integer pageSize) {
        // TODO Auto-generated method stub
        Map<String, Object> pagingIndex = new HashMap<>();
        pagingIndex.put("currentIndex", (currentPage - 1) * pageSize);
        pagingIndex.put("pageSize", pageSize);
        
        if (listCategories.size() == 0)
            listCategories = null;
        if (listBrands.size() == 0)
            listBrands = null;
        if (listStyles.size() == 0)
            listStyles = null;
        if (sort.equals("0"))
            sort = null;
        return lightDao.listTypeLight(listCategories, listBrands, listStyles, sort, lowPrice, highPrice, pagingIndex);
    }

    @Override
    public String getAllPages(List<Integer> listCategories, List<Integer> listBrands, List<Integer> listStyles, String lowPrice, String highPrice) {
        // TODO Auto-generated method stub
        if (listCategories.size() == 0)
            listCategories = null;
        if (listBrands.size() == 0)
            listBrands = null;
        if (listStyles.size() == 0)
            listStyles = null;
        String all = lightDao.getAllPages(listCategories, listBrands, listStyles, lowPrice, highPrice);
        int size = 2;
        String allPages = String.valueOf((int)Math.ceil(Double.parseDouble(all) / size));
        return allPages;
    }

    @Override
    public List<Light> listSearchLight(String searchMessage, Integer currentPage, Integer pageSize) {
        // TODO Auto-generated method stub
        Map<String, Object> pagingIndex = new HashMap<>();
        pagingIndex.put("currentIndex", (currentPage - 1) * pageSize);
        pagingIndex.put("pageSize", pageSize);
        return lightDao.listSearchLight(searchMessage, pagingIndex);
    }

    @Override
    public String getSearchPages(String searchMessage) {
        // TODO Auto-generated method stub
        String all = lightDao.getSearchPages(searchMessage);
        int size = 2;
        String allPages = String.valueOf((int)Math.ceil(Double.parseDouble(all) / size));
        return allPages;
    }

    @Autowired
    private LightDescription lightDescription;
    
    @Autowired
    private Light light;
    
    @Autowired
    private CategoryDao categoryDao;
    
    @Autowired
    private BrandDao brandDao;
    
    @Autowired
    private StyleDao styleDao;
    
    @Autowired
    private CommentDao commentDao;
    
    @Override
    public LightDescription getLightDescription(Integer lightID) {
        // TODO Auto-generated method stub
        light = lightDao.getLightByID(lightID);
        lightDescription.setLightID(lightID);
        lightDescription.setColor(light.getColor());
        lightDescription.setDescription(light.getDescription());
        lightDescription.setLightName(light.getLightName());
        lightDescription.setLocate(light.getLocate());
        lightDescription.setPrice(light.getPrice());
        lightDescription.setSales(light.getSales());
        lightDescription.setScore(light.getScore());
        lightDescription.setStuff(light.getStuff());
        lightDescription.setQuantity(light.getQuantity());
        
        lightDescription.setCategory(categoryDao.getCategoryName(light.getCategoryID()));
        lightDescription.setBrand(brandDao.getBrandName(light.getBrandID()));
        lightDescription.setStyle(styleDao.getStyleName(light.getStyleID()));
        lightDescription.setComments(commentDao.CountComments(lightID));
        return lightDescription;
    }

    @Override
    public String getLightDescriptionImage(Integer lightID) {
        // TODO Auto-generated method stub
        return lightDao.getLightDescriptionImage(lightID);
    }

}
