package com.lightingshop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.entity.Brand;
import com.lightingshop.service.IBrandService;

@Controller
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private IBrandService brandService;
    
    @RequestMapping("")
    @ResponseBody
    public List<Brand> listBrand() {
        
        return brandService.listBrand();
    }
}
