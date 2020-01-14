package com.factory.shape;

/**
 * @Author 李非凡
 * @Description: 原型
 * @Date 2020/1/14 9:30
 * @Version 1.0
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
