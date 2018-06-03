package com.lightingshop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.entity.Style;
import com.lightingshop.service.IStyleService;

@Controller
@RequestMapping("/styles") //注意不能为style，不然首页引入style.css发生406错误
public class StyleController {

    @Autowired
    private IStyleService styleService;
    
    @RequestMapping("")
    @ResponseBody
    public List<Style> listStyle() {
        
        return styleService.listStyle();
    }
}
