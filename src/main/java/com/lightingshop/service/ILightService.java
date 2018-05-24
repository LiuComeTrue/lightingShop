package com.lightingshop.service;

import java.util.List;

import com.lightingshop.entity.Light;

public interface ILightService {

    /**
     * 获取最新添加的灯饰产品
     * @return
     */
    List<Light> listNewLight();
}
