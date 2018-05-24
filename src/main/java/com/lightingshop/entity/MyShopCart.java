package com.lightingshop.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("myShopCart")
public class MyShopCart {

    private Integer shopCartID;

    private Integer lightID;

    private Integer userID;

    private Date addDate;

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

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "MyShopCart [shopCartID=" + shopCartID + ", lightID=" + lightID + ", userID=" + userID + ", addDate="
                + addDate + "]";
    }
}
