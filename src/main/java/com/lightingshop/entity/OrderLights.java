package com.lightingshop.entity;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component("orderLights")
public class OrderLights {
    private Integer quantity;

    private BigDecimal singleprice;
    
    private String orderID;

    private Integer lightID;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID == null ? null : orderID.trim();
    }

    public Integer getLightID() {
        return lightID;
    }

    public void setLightID(Integer lightID) {
        this.lightID = lightID;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSingleprice() {
        return singleprice;
    }

    public void setSingleprice(BigDecimal singleprice) {
        this.singleprice = singleprice;
    }
}