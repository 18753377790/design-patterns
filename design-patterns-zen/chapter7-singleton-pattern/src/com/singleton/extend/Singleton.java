package com.singleton.extend;

/**
 * @Author 李非凡
 * @Description: 线程不安全的单例
 * @Date 2020/9/22 17:43
 * @Version 1.0
 */
public class Singleton {

    private static Singleton singleton = null;

    /**
     * 限制产生多个对象
     */
    private Singleton() {}

    /**
     * 通过该方法获得实例对象
     * @return 单例
     */
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }

    /**
     *
     */
    public void say() {

    }
}
