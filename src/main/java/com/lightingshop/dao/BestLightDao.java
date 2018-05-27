package com.lightingshop.dao;

import java.util.List;

import com.lightingshop.entity.BestLight;

public interface BestLightDao {

    /**
     * 取出bestlight表中前三个灯饰ID
     * @return
     */
    List<BestLight> listBestLight();
}
