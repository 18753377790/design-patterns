package com.factory.definition;

/**
 * @Author 李非凡
 * @Description: 抽象产品类
 * @Date 2020/9/23 16:28
 * @Version 1.0
 */
public abstract class AbstractProductB {

    /**
     * 每个产品共有的方法
     */
    public void shareMethod() {

    }

    /**
     * 每个产品相同方法，不同实现
     */
    public abstract void doSomething();
}
