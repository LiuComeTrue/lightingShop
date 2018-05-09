package com.lightingshop.interceptor;

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
        //URL:login.jsp是公开的;这个demo是除了login.jsp是可以公开访问的，其它的URL都进行拦截控制  
        if(url.indexOf("login") >= 0) {  
            return true;  
        }  
        //获取Session  
        HttpSession session = request.getSession();  
        User currUser = (User)session.getAttribute("currUser");  

        if(currUser != null) {  
            return true;  
        }  

        //不符合条件的，跳转到登录界面  
        request.getRequestDispatcher("login.jsp").forward(request, response);  

        return false;
    }
    
}
