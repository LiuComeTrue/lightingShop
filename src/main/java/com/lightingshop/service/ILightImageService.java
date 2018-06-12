package com.lightingshop.service;

import java.util.List;

import com.lightingshop.entity.LightImage;

public interface ILightImageService {

    /**
     * 获取某灯饰的所有展示图片路径
     * @return
     */
    List<LightImage> listLightImage(Integer lightID);
}
