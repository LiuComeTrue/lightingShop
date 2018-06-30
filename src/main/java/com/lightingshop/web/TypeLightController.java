package com.lightingshop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.type.TypeBindings;
import com.lightingshop.dto.Type;
import com.lightingshop.entity.Light;
import com.lightingshop.service.ILightService;

/**
 * 根据前台传来的分页信息和json字符串，返回分类后的灯饰产品
 * json字符串封装为Type，包含多种分类对象
 * @author ZC
 *
 */
@Controller
@RequestMapping("/type")
public class TypeLightController {

    @Autowired
    private ILightService lightService;
    
    @RequestMapping(value="/{currentPage}/{pageSize}", method=RequestMethod.POST)
    @ResponseBody
    public List<Light> listLight(@PathVariable Integer currentPage, @PathVariable Integer pageSize,
            @RequestBody Type type) {
        
        System.out.println(type.toString());
        return lightService.listTypeLight(type.getCategories(), type.getBrands(), type.getStyles(), 
                type.getSort(), type.getLowPrice(), type.getHighPrice(), currentPage, pageSize);
    }
    
    @RequestMapping(value="", method=RequestMethod.POST)
    @ResponseBody
    public String getAllPages(@RequestBody Type type) {
        
        return lightService.getAllPages(type.getCategories(), type.getBrands(), type.getStyles(), 
                type.getLowPrice(), type.getHighPrice());
    }
       
}
