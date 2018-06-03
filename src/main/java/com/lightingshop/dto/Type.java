package com.lightingshop.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 多种分类bean
 * 灯饰种类
 * 灯饰品牌
 * 排序规则
 * 价格区间
 * @author ZC
 *
 */
@Component("type")
public class Type {

    public List<Integer> categories;
    
    public List<Integer> brands;
    
    public List<Integer> styles;
    
    public String sort;
    
    public String lowPrice;
    
    public String highPrice;

    public String getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    public String getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(String highPrice) {
        this.highPrice = highPrice;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public List<Integer> getCategories() {
        return categories;
    }

    public void setCategories(List<Integer> categories) {
        this.categories = categories;
    }

    public List<Integer> getBrands() {
        return brands;
    }

    public void setBrands(List<Integer> brands) {
        this.brands = brands;
    }
    

    public List<Integer> getStyles() {
        return styles;
    }

    public void setStyles(List<Integer> styles) {
        this.styles = styles;
    }

    @Override
    public String toString() {
        return "Type [categories=" + categories + ", brands=" + brands + ", styles=" + styles + ", sort=" + sort
                + ", lowPrice=" + lowPrice + ", highPrice=" + highPrice + "]";
    }
}
