package com.factory.definition;

/**
 * @Author 李非凡
 * @Description: 抽象工厂类
 * @Date 2020/9/23 16:13
 * @Version 1.0
 */
public abstract class AbstractCreator {

    /**
     * 创建A产品家族
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建B产品家族
     * @return
     */
    public abstract AbstractProductB createProductB();
}
