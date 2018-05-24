package com.lightingshop.entity;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component("light")
public class Light {

    private Integer lightID;

    private Integer catagoryID;

    private Integer brandID;

    private Integer styleID;

    private String stuff;

    private String color;

    private String locate;

    private BigDecimal price;

    private Integer quantity;

    private String description;

    private String images;

    public Integer getLightID() {
        return lightID;
    }

    public void setLightID(Integer lightID) {
        this.lightID = lightID;
    }

    public Integer getCatagoryID() {
        return catagoryID;
    }

    public void setCatagoryID(Integer catagoryID) {
        this.catagoryID = catagoryID;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public Integer getStyleID() {
        return styleID;
    }

    public void setStyleID(Integer styleID) {
        this.styleID = styleID;
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocate() {
        return locate;
    }

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Light [lightID=" + lightID + ", catagoryID=" + catagoryID + ", brandID=" + brandID + ", styleID="
                + styleID + ", stuff=" + stuff + ", color=" + color + ", locate=" + locate + ", price=" + price
                + ", quantity=" + quantity + ", description=" + description + ", images=" + images + "]";
    }
    
}
