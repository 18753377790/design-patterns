package com.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author 李非凡
 * @Description: 动态代理类
 * @Date 2020/9/25 14:13
 * @Version 1.0
 */
public class GamePlayInvocationHandler implements InvocationHandler {

//    Class cls = null;

    Object obj = null;

    public GamePlayInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
