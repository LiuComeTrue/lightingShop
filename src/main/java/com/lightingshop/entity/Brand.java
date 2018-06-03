package com.lightingshop.entity;

import org.springframework.stereotype.Component;

@Component("brand")
public class Brand {

    private Integer brandID;

    private String brandName;

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
