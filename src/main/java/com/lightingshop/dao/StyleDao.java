package com.lightingshop.dao;

import java.util.List;

import com.lightingshop.entity.Style;

public interface StyleDao {

    /**
     * 获取style表所有数据
     * @return
     */
    List<Style> listStyle();
    
    /**
     * 获取风格名称
     * @param styleName
     * @return
     */
    String getStyleName(Integer styleName);
}
