package com.factory.singleton;

import java.lang.reflect.Constructor;

/**
 * @Author 李非凡
 * @Description: 负责生成单例的工厂类
 * @Date 2020/9/23 10:26
 * @Version 1.0
 */
public class SingletonFactory {

    /**
     *
     */
    private static Singleton singleton;

    static {
        try {
            Class c1 = Class.forName(Singleton.class.getName());
            // 获得无参构造
            Constructor constructor = c1.getDeclaredConstructor();
            // 设置无参构造是可访问的
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton = (Singleton)constructor.newInstance();
        } catch (Exception e) {
            System.out.println("异常处理");
        }
    }

    /**
     *
     * @return
     */
    public static Singleton getSingleton() {
        return singleton;
    }
}
