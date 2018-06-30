package com.lightingshop.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("wishList")
public class WishList {

    private Integer wishListID;

    private Integer lightID;

    private Integer userID;

    private String storeDate;

    public String getStoreDate() {
        return storeDate;
    }

    public void setStoreDate(String storeDate) {
        this.storeDate = storeDate;
    }

    public Integer getWishListID() {
        return wishListID;
    }

    public void setWishListID(Integer wishListID) {
        this.wishListID = wishListID;
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

    @Override
    public String toString() {
        return "WishList [wishListID=" + wishListID + ", lightID=" + lightID + ", userID=" + userID + ", storeDate="
                + storeDate + "]";
    }
}
