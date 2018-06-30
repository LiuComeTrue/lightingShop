package com.lightingshop.dto;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component("shopCartLight")
public class ShopCartLight {

    private Integer lightID;
    
    private String lightName;
    
    private String brand;
    
    private Integer stock;
    
    private String image;
    
    private BigDecimal price;
    
    private Integer quantity;
    
    private boolean checked = false;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Integer getLightID() {
        return lightID;
    }

    public void setLightID(Integer lightID) {
        this.lightID = lightID;
    }

    public String getLightName() {
        return lightName;
    }

    public void setLightName(String lightName) {
        this.lightName = lightName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    @Override
    public String toString() {
        return "ShopCartLight [lightID=" + lightID + ", lightName=" + lightName + ", brand=" + brand + ", stock="
                + stock + ", image=" + image + ", price=" + price + ", quantity=" + quantity + "]";
    }
    
}
