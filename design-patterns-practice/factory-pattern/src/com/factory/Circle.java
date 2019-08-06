package com.factory;

/**
 * @Author 李非凡
 * @Description:
 * 圆形
 * @Date 2019/7/10 13:59
 * @Version 1.0
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
