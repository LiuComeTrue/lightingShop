package com.lightingshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.service.IWishListService;

@RequestMapping("/wishList")
@Controller
public class WishListController {

    @Autowired
    private IWishListService wishListService;
    
    @RequestMapping(value="/{lightID}/{userID}", method=RequestMethod.POST)
    @ResponseBody
    public int addWishList(@PathVariable Integer lightID, @PathVariable Integer userID) {
        
        return wishListService.addWishList(lightID, userID);
    }
}
