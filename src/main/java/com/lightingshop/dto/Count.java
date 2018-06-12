package com.lightingshop.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component("count")
public class Count {
	
	private List<String> lightID;
	private List<String> sum;
	
	public List<String> getLightID() {
		return lightID;
	}
	public void setLightID(List<String> lightID) {
		this.lightID = lightID;
	}
	public List<String> getSum() {
		return sum;
	}
	public void setSum(List<String> sum) {
		this.sum = sum;
	}
	
}
