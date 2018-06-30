package com.lightingshop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.entity.Light;
import com.lightingshop.service.IBestLightService;

@Controller
@RequestMapping("/bestLight")
public class BestLightController {

    @Autowired
    private IBestLightService bestLightService;
    
    @RequestMapping("")
    @ResponseBody
    public List<Light> listBestLight() {
        
        return bestLightService.listBestLight();
    }
}
