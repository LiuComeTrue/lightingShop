package com.lightingshop.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lightingshop.entity.User;
import com.lightingshop.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    
    @Autowired
    private User user;
    
    @RequestMapping(value="/regiter/{id}/{psw}/{name}/{phone}/{address}", method=RequestMethod.POST)
    @ResponseBody
    public int regiter(@PathVariable String id, @PathVariable String psw, 
            @PathVariable String name, @PathVariable String phone, @PathVariable String address) {
        
        return userService.regiter(id, psw, name, phone, address);
    }
    
    @RequestMapping(value="/{id}/{psw}", method=RequestMethod.GET)
    @ResponseBody
    public int login(@PathVariable String id, @PathVariable String psw, HttpSession session) {
        
        user = userService.login(id, psw);
        int result = 1;
        if (user == null)
            result = 0;
        else
            session.setAttribute("user", user);
        return result;
    }
    
    @RequestMapping(value="", method=RequestMethod.GET)
    @ResponseBody
    public User getUser(HttpSession session) {
        
        /*user = (User) session.getAttribute("user");
        String result;
        if (user == null)
            result = "null";
        else
            result = user.getLoginID();
        return result;*/
        if(session.getAttribute("user") != null) {
            user = (User) session.getAttribute("user");
            Integer userID = user.getUserID();
            return userService.getUserById(userID);
        }
        user = null;
        return user;
    }
    
}
