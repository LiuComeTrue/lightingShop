package com.lightingshop.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.lightingshop.entity.User;
import com.lightingshop.service.impl.MyShopCartImpl;
import com.lightingshop.util.RedisUtil;

public class MethodCacheInterceptor implements MethodInterceptor {

    private RedisUtil redisUtil;
    private List<String> targetNamesList; // 禁用缓存的类名列表
    private List<String> methodNamesList; // 禁用缓存的方法列表
    private String defaultCacheExpireTime; // 缓存默认的过期时间

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object value = null;

        String targetName = invocation.getThis().getClass().getName();
        String methodName = invocation.getMethod().getName();
        if (!isAddCache(targetName, methodName)) {
            // 跳过缓存返回结果
            return invocation.proceed();
        }        
        Object[] arguments = invocation.getArguments();
        String key = getCacheKey(targetName, methodName, arguments);
        
        /*if (methodName.equals("addMyShopCart") || methodName.equals("deleteMyShopCart")) {
            System.out.println("\n=================add of delete=====================\n");
            Object reuslt = invocation.proceed();
            System.out.println(arguments[1]);
            value = new MyShopCartImpl().listMyShopCart((Integer)arguments[1]);
            final String tkey = key;
            final Object tvalue = value;
            redisUtil.remove("shop_" + arguments[1]);
            return reuslt;
        }*/
        
        try {
            // 判断是否有缓存
            if (redisUtil.exists(key)) {
                return redisUtil.get(key);
            }
            System.out.println("\n==========================写入缓存======================\n");
            // 写入缓存
            value = invocation.proceed();
            if (value != null) {
                final String tkey = key;
                final Object tvalue = value;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        redisUtil.set(tkey, tvalue, Long.parseLong(defaultCacheExpireTime));
                    }
                }).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (value == null) {
                return invocation.proceed();
            }
        }
        return value;
    }

    /**
     * 是否加入缓存
     *
     * @return
     */
    private boolean isAddCache(String targetName, String methodName) {
        boolean flag = true;
        if (targetNamesList.contains(targetName)
                || methodNamesList.contains(methodName) || targetName.contains("$$EnhancerBySpringCGLIB$$")) {
            flag = false;
        }
        return flag;
    }

    /**
     * 创建缓存key
     *
     * @param targetName
     * @param methodName
     * @param arguments
     */
    private String getCacheKey(String targetName, String methodName,
                               Object[] arguments) {
        /*StringBuffer sbu = new StringBuffer();
        sbu.append(targetName).append("_").append(methodName);
        if ((arguments != null) && (arguments.length != 0)) {
            for (int i = 0; i < arguments.length; i++) {
                sbu.append("_").append(arguments[i]);
            }
        }
        return sbu.toString();*/
        return "shop_" + arguments[0];
    }

    public void setRedisUtil(RedisUtil redisUtil) {
        this.redisUtil = redisUtil;
    }

    public void setTargetNamesList(List<String> targetNamesList) {
        this.targetNamesList = targetNamesList;
    }

    public void setMethodNamesList(List<String> methodNamesList) {
        this.methodNamesList = methodNamesList;
    }

    public void setDefaultCacheExpireTime(String defaultCacheExpireTime) {
        this.defaultCacheExpireTime = defaultCacheExpireTime;
    }

}
