package com.lightingshop.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lightingshop.entity.User;
import com.lightingshop.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	
	@Autowired
	private User user;
	
	@RequestMapping("/login")
	private String login(HttpServletRequest request, Model model) {
		
	    model.addAttribute("name", request.getParameter("username"));
		model.addAttribute("psw", request.getParameter("password"));
		return "login";
	    /*String name = userService.checkUser(user);
		System.out.println(name);
		if (name != null) {
			return "login";
		}		
		return "redirect:/index.jsp";*/
	}
	
	@RequestMapping("/login1")
	private ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		user.setId(Integer.valueOf(request.getParameter("username")));
		user.setName("name");
		user.setPassword(request.getParameter("password"));
		String name = userService.checkUser(user);
		System.out.println(name);
		if (name != null) {
			mav.addObject("name", name);
			mav.setViewName("login");
		} else
			mav.setViewName("redirect:/index.jsp");
		
		return mav;
	}
	
}
