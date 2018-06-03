package com.lightingshop.service;

import java.util.List;

import com.lightingshop.entity.Style;

public interface IStyleService {

    /**
     * 获取style表
     * @return
     */
    List<Style> listStyle();
}
