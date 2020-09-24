package com.factory.lazy;

/**
 * @Author 李非凡
 * @Description:TODE
 * @Date 2020/9/23 9:58
 * @Version 1.0
 */
public class ConcreteProduct2 extends Product {

    @Override
    public void method2() {
        System.out.println("延迟加载的方法2");
    }
}
