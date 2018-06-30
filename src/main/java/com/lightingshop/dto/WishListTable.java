package com.lightingshop.dto;

import java.math.BigDecimal;

public class WishListTable {

    private Integer lightID;
    
    private String image;
    
    private String lightName;
    
    private BigDecimal price;
    
    private String storeDate;

    public Integer getLightID() {
        return lightID;
    }

    public void setLightID(Integer lightID) {
        this.lightID = lightID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLightName() {
        return lightName;
    }

    public void setLightName(String lightName) {
        this.lightName = lightName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStoreDate() {
        return storeDate;
    }

    public void setStoreDate(String storeDate) {
        this.storeDate = storeDate;
    }
}
