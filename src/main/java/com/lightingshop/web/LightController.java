package com.lightingshop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.entity.Light;
import com.lightingshop.service.ILightService;

@RequestMapping("/light")
@Controller
public class LightController {

    @Autowired
    private ILightService lightService;
    
    @RequestMapping("/NewLight")
    @ResponseBody
    public List<Light> listNewLight() {

        return lightService.listNewLight();
    }
    
    @RequestMapping("/topLight")
    @ResponseBody
    public List<Light> listTopSeller() {
        
        return lightService.listTopSeller();
    }
    
    @RequestMapping("/ratedLight")
    @ResponseBody
    public List<Light> listRated() {
        
        return lightService.listRated();
    }
    
    @RequestMapping("/{currentPage}/{pageSize}")
    @ResponseBody
    public List<Light> listLight(@PathVariable Integer currentPage, @PathVariable Integer pageSize) {
        
        return lightService.listLight(currentPage, pageSize);
    }
    
    @RequestMapping(value = "/{searchMessage}/{currentPage}/{pageSize}", method = RequestMethod.GET)
    @ResponseBody
    public List<Light> listSearchLight(@PathVariable String searchMessage, 
            @PathVariable Integer currentPage, @PathVariable Integer pageSize) {
        
        //System.out.println("search Controller");
        //System.out.println(searchMessage);
        return lightService.listSearchLight(searchMessage, currentPage, pageSize);
    }
    
    @RequestMapping("/{searchMessage}")
    @ResponseBody
    public String getSearchPages(@PathVariable String searchMessage) {
        
        return lightService.getSearchPages(searchMessage);
    }
    
}
