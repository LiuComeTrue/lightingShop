package com.lightingshop.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.dto.ShopCartLight;
import com.lightingshop.entity.User;
import com.lightingshop.service.IMyShopCartService;

@RequestMapping("/myShopCart")
@Controller
public class MyShopCartController {

    @Autowired
    private IMyShopCartService myShopCartService;
    
    @Autowired
    private User user;
    
    @RequestMapping(value="/{lightID}/{quantity}", method=RequestMethod.POST)
    @ResponseBody
    public int addMyShopCart(@PathVariable Integer lightID, @PathVariable Integer quantity, HttpSession session) {
        
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        return myShopCartService.addMyShopCart(lightID, userID, quantity);
    }
    
    @RequestMapping("")
    @ResponseBody
    public List<ShopCartLight> listShopCartLight(HttpSession session) {
        
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        return myShopCartService.listMyShopCart(userID);
    }
    
    @RequestMapping(value="", method=RequestMethod.DELETE)
    @ResponseBody
    public int deleteMyShopCart(@RequestBody List<Integer> listLight, HttpSession session) {
        
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        return myShopCartService.deleteMyShopCart(listLight, userID);
    }
    
}
