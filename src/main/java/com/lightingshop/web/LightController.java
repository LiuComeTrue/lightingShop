package com.lightingshop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
