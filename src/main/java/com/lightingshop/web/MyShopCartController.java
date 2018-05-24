package com.lightingshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.service.IMyShopCartService;

@RequestMapping("/myShopCart")
@Controller
public class MyShopCartController {

    @Autowired
    private IMyShopCartService myShopCartService;
    
    @RequestMapping(value="/{lightID}/{userID}", method=RequestMethod.POST)
    @ResponseBody
    public int addMyShopCart(@PathVariable Integer lightID, @PathVariable Integer userID) {
        
        return myShopCartService.addMyShopCart(lightID, userID);
    }
}
