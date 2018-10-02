package com.lightingshop.aop;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lightingshop.dto.ShopCartLight;
import com.lightingshop.service.IMyShopCartService;
import com.lightingshop.service.impl.MyShopCartImpl;
import com.lightingshop.util.RedisUtil;

@Component
@Aspect
public class ShopCartAspect {

    @Autowired
    private IMyShopCartService myShopCartService;
    
    @Autowired
    private RedisUtil redisUtil;
    
    @Pointcut("execution(* com.lightingshop.service.impl.MyShopCartImpl.add*(..))")
    public void add() {}
    
    @Pointcut("execution(* com.lightingshop.service.impl.MyShopCartImpl.delete*(..))")
    public void del() {}
    
    @AfterReturning(returning = "result", pointcut = "add()")
    public void addAfterReturn(JoinPoint joinPoint, Object result) {
        System.out.println("==================result=" + result);
        Object[] args = joinPoint.getArgs();
        System.out.println("==================userID=" + args[1]);
        ShopCartLight shopCartLight = myShopCartService.getShopCartLight((int)result, (int)args[1]);
        //RedisUtil redisUtil = new RedisUtil();
        String key = "shop_" + args[1];
        List<ShopCartLight> list = (List<ShopCartLight>)redisUtil.get(key);
        list.add(shopCartLight);
        redisUtil.set(key, list);
    }
    
    @AfterReturning(returning = "result", pointcut = "del()")
    public void delAfterReturn(JoinPoint joinPoint, Object result) {

        Object[] args = joinPoint.getArgs();
        List<Integer> listLightID = (List<Integer>)args[0];
        String key = "shop_" + args[1];
        List<ShopCartLight> list = (List<ShopCartLight>)redisUtil.get(key);
        for (Integer lightID : listLightID) {
            ShopCartLight shopCartLight = new ShopCartLight();
            shopCartLight.setLightID(lightID);
            list.remove(shopCartLight);
        }

        redisUtil.set(key, list);
    }
    
}
