package com.lightingshop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.entity.LightImage;
import com.lightingshop.service.ILightImageService;

@Controller
@RequestMapping("/lightImages")
public class LightImageController {

    @Autowired
    private ILightImageService lightImageService;
    
    @RequestMapping("/{lightID}")
    @ResponseBody
    public List<LightImage> listLightImage(@PathVariable Integer lightID) {
        
        return lightImageService.listLightImage(lightID);
    }
}
