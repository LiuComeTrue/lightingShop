package com.lightingshop.service;

import java.util.List;

import com.lightingshop.entity.BestLight;
import com.lightingshop.entity.Light;

public interface IBestLightService {

    /**
     * 取出bestlight表中前三个灯饰ID,再根据ID查light表中产品
     * @return
     */
    List<Light> listBestLight();
}
