package com.lightingshop.dto;

import java.math.BigDecimal;

import com.lightingshop.entity.Orders;

public class OrderLightCount {
	
	private Integer lightID;
    
    private Integer sum;


    public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

    public Integer getLightID() {
        return lightID;
    }

    public void setLightID(Integer lightID) {
        this.lightID = lightID;
    }
}
