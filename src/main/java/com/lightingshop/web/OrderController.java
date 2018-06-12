package com.lightingshop.web;

import java.math.BigDecimal;
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
import com.lightingshop.entity.Orders;
import com.lightingshop.entity.User;
import com.lightingshop.service.IOrdersService;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private IOrdersService ordersService;
    
    @Autowired
    private User user;
    
    @RequestMapping(value="/{totalMoney}", method=RequestMethod.POST)
    @ResponseBody
    public String[] addOrder(@PathVariable BigDecimal totalMoney, @RequestBody List<ShopCartLight> light, HttpSession session) {
            
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        String orderID = null;
        orderID = ordersService.addOrder(light, userID, totalMoney);
        System.out.println(orderID);
        String[] id = new String[1];
        id[0] = orderID;
        return id;
    }
    
    @RequestMapping(value="/{orderID}", method=RequestMethod.GET) 
    @ResponseBody
    public List<ShopCartLight> getOrder(@PathVariable String orderID) {
        
        return ordersService.listOrder(orderID);
    }
    
    @RequestMapping(value="") 
    @ResponseBody
    public List<Orders> listOrder(HttpSession session) {
        
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        return ordersService.listOrders(userID);
    }
    
    @RequestMapping(value="/{orderID}", method=RequestMethod.PUT) 
    @ResponseBody
    public int cancelOrder(@PathVariable String orderID, HttpSession session) {
        
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        int status = 4;
        return ordersService.cancelOrder(orderID, status);
    }
    
    @RequestMapping(value="/{orderID}", method=RequestMethod.DELETE) 
    @ResponseBody
    public int RefundOrder(@PathVariable String orderID, HttpSession session) {
        
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        int status = 1;
        return ordersService.cancelOrder(orderID, status);
    }
    
    @RequestMapping(value="confirm/{orderID}", method=RequestMethod.PUT) 
    @ResponseBody
    public int confirmOrder(@PathVariable String orderID, HttpSession session) {
        
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        int status = 6;
        return ordersService.cancelOrder(orderID, status);
    }
    
    @RequestMapping(value="pay/{orderID}", method=RequestMethod.PUT) 
    @ResponseBody
    public int payOrder(@PathVariable String orderID, HttpSession session) {
        
        user = (User)session.getAttribute("user");
        Integer userID = user.getUserID();
        int status = 0;
        return ordersService.cancelOrder(orderID, status);
    }
}
