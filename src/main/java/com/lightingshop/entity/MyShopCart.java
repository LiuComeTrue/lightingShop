package com.lightingshop.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("myShopCart")
public class MyShopCart {

    private Integer shopCartID;

    private Integer lightID;

    private Integer userID;
    
    private Integer quantity;

    private String addDate;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getShopCartID() {
        return shopCartID;
    }

    public void setShopCartID(Integer shopCartID) {
        this.shopCartID = shopCartID;
    }

    public Integer getLightID() {
        return lightID;
    }

    public void setLightID(Integer lightID) {
        this.lightID = lightID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "MyShopCart [shopCartID=" + shopCartID + ", lightID=" + lightID + ", userID=" + userID + ", quantity="
                + quantity + ", addDate=" + addDate + "]";
    }
}
