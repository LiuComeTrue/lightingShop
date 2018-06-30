package com.lightingshop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.entity.Category;
import com.lightingshop.service.ICategoryService;


@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;
    
    @RequestMapping(value="", method=RequestMethod.GET)
    @ResponseBody
    public List<Category> listCategory() {
        
        return categoryService.listCategory();
    }
        
}
