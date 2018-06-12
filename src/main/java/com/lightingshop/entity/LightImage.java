package com.lightingshop.entity;

import org.springframework.stereotype.Component;

@Component("lightImage")
public class LightImage {

    private Integer lightID;
    
    private String images;

    public Integer getLightID() {
        return lightID;
    }

    public void setLightID(Integer lightID) {
        this.lightID = lightID;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
