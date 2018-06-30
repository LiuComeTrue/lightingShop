package com.lightingshop.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.dto.WishListTable;
import com.lightingshop.entity.User;
import com.lightingshop.service.IWishListService;

@RequestMapping("/wishList")
@Controller
public class WishListController {

    @Autowired
    private IWishListService wishListService;
    
    @Autowired
    private User user;
    
    @RequestMapping(value="/{lightID}", method=RequestMethod.POST)
    @ResponseBody
    public int addWishList(@PathVariable Integer lightID, HttpSession session) {
        
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        return wishListService.addWishList(lightID, userID);
    }
    
    @RequestMapping(value="")
    @ResponseBody
    public List<WishListTable> listWishList(HttpSession session) {
        
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        return wishListService.listWishtList(userID);
    }
    
    @RequestMapping(value="/{lightID}", method=RequestMethod.DELETE)
    @ResponseBody
    public int deleteWishList(@PathVariable Integer lightID, HttpSession session) {
        
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        return wishListService.deleteWishList(lightID, userID);
    }
}
