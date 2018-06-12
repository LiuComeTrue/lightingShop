package com.lightingshop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.lightingshop.dto.Msg;
import com.lightingshop.dto.Type;
import com.lightingshop.entity.Light;
import com.lightingshop.service.ILightManageService;
import com.lightingshop.service.IOrderManageService;

@Controller
public class LightManageController {

	@Autowired
	private ILightManageService lightManageService;
	
	@Autowired
	Light light;
	
	/**
	 * 页面获取灯饰表信息
	 * @param pn
	 * @param categories
	 * @param brands
	 * @param styles
	 * @return
	 */
	@RequestMapping(value="/LightManageList/{pn}/{key}/{orderBy}", method=RequestMethod.POST)
    @ResponseBody
	private PageInfo LightList(@PathVariable Integer pn, @RequestBody Type type,@PathVariable String key,@PathVariable String orderBy) {
		
		List<Light> lights =  lightManageService.ListLight(pn, type.getCategories(), type.getCategories(), type.getCategories(),key,orderBy);
		PageInfo page = new PageInfo(lights);
		System.out.println("pageSize:" + page.getPageSize());  
		return page;
	}
	
	@RequestMapping("/UpdateLight")
	@ResponseBody
	private Msg UpdateLight(Light lights) {
		light.toString();
		lightManageService.UpdateLightInfo(lights);
		
		return Msg.Success();
	}
	
	@RequestMapping("/DeleteLight/{id}")
	@ResponseBody
	private Msg DeleteLight(@PathVariable Integer id) {
		Light Dellight = new Light();
		Dellight.setLightID(id);
		Dellight.setQuantity(0);
		lightManageService.UpdateLightInfo(Dellight);
		return Msg.Success();
	}
	
	@RequestMapping("/lightTips")
	@ResponseBody
	private Integer LightTips() {
		return lightManageService.selectLightTips();
	}
}
