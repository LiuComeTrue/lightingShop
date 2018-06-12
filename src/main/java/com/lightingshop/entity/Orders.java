package com.lightingshop.entity;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.druid.sql.visitor.functions.Substring;
import com.lightingshop.util.DateUtil;

@Component("orders")
public class Orders {
    private String orderID;

    private Integer userID;

    private BigDecimal totalprice;

    private	String date;

    private Integer orderstateid;

    private Integer showornot;

    private String receivename;

    private String receivephone;

    private String address;

    private String email;

    private String postalcode;

    private String posttype;

    private String paymenttype;

    private BigDecimal postfee;
    
    List<OrderLights> lights;
    
    private String lightNames;

    public String getLightNames() {
        return lightNames;
    }

    public void setLightNames(String lightNames) {
        this.lightNames = lightNames;
    }

    public List<OrderLights> getLights() {
		return lights;
	}

	public void setLights(List<OrderLights> lights) {
		this.lights = lights;
	}

	public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID == null ? null : orderID.trim();
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
    	this.date = date;
    }

    public Integer getOrderstateid() {
        return orderstateid;
    }

    public void setOrderstateid(Integer orderstateid) {
        this.orderstateid = orderstateid;
    }

    public Integer getShowornot() {
        return showornot;
    }

    public void setShowornot(Integer showornot) {
        this.showornot = showornot;
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }

    public String getReceivephone() {
        return receivephone;
    }

    public void setReceivephone(String receivephone) {
        this.receivephone = receivephone == null ? null : receivephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    public String getPosttype() {
        return posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype == null ? null : posttype.trim();
    }

    public String getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(String paymenttype) {
        this.paymenttype = paymenttype == null ? null : paymenttype.trim();
    }

    public BigDecimal getPostfee() {
        return postfee;
    }

    public void setPostfee(BigDecimal postfee) {
        this.postfee = postfee;
    }
}