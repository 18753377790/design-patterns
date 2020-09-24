package com.factory.lazy;

/**
 * @Author 李非凡
 * @Description: 抽象产品类
 * @Date 2020/9/23 14:20
 * @Version 1.0
 */
public abstract class Product {

    /**
     * 产品类的公共方法
     */
    public void method1() {
        System.out.println("延迟加载的方法1");
    }

    /**
     * 抽象方法
     */
    public abstract void method2();
}
