package com.lightingshop.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lightingshop.entity.User;

public class LoginInterceptor implements HandlerInterceptor {

    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Interceptor:afterCompletion");

    }

    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub
        System.out.println("Interceptor:postHandle");

    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
        
        System.out.println("Interceptor:preHandle");
        //获取请求的URL  
        String url = request.getRequestURI();
        
        //拦截所有请求，必须先登录
        HttpSession session = request.getSession();  
        //User currUser = (User)session.getAttribute("user");         
        if(session.getAttribute("user") == null) {  
            if(url.contains("login.html")) {  
                return true;  
            }
            else 
                request.getRequestDispatcher("/view/login.html").forward(request, response);
            return false;  
        }
        
        /*//获取请求的URL  
        String url = request.getRequestURI();  
        
        if (request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){ //如果是ajax请求响应头会有x-requested-with    
            
            if (url.contains("myShopCart")) {
                System.out.println("myShopCart");
                PrintWriter out = response.getWriter();    
                out.print("loseSession");//session失效  
                out.flush();  
                return false;  
            }
        }
        //URL:login.jsp是公开的;这个demo是除了login.jsp是可以公开访问的，其它的URL都进行拦截控制  
        if(url.indexOf("wishList") >= 0 || url.indexOf("myShopCart") >= 0 || url.indexOf("order") >= 0) {  
            //获取Session  
            HttpSession session = request.getSession();  
            User currUser = (User)session.getAttribute("user"); 
            if(currUser == null) {  
                request.getRequestDispatcher("login.html").forward(request, response);  
                return false;  
            } 
        }  */
        return true; 

    }
    
}
