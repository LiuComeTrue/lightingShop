package com.lightingshop.entity;

public class OrderlightsKey {
    private String orderid;

    private Integer lightid;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getLightid() {
        return lightid;
    }

    public void setLightid(Integer lightid) {
        this.lightid = lightid;
    }
}