package com.lightingshop.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.dto.Count;
import com.lightingshop.dto.OrderLightCount;
import com.lightingshop.service.ICountService;

@Controller
public class CountController {
	
	@Autowired
	Count count;
	
	@Autowired
	ICountService countService;
	
	@RequestMapping("/CountLight/{n}")
	@ResponseBody
	private Count setCountLight(@PathVariable Integer n) {
		
		List<String> id = new ArrayList();
		List<String> num = new ArrayList();
		List<OrderLightCount> list = countService.setCountLight(n);
		for(OrderLightCount o : list) {
			id.add("灯饰ID:"+o.getLightID().toString());
			num.add(o.getSum().toString());
		}
		count.setLightID(id);
		count.setSum(num);
		
		return count;
	}
	
	@RequestMapping("/CountPrice")
	@ResponseBody
	private Count setCountPrice() {
		
		return countService.setCountPrice();
		
	}
}
