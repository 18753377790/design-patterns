package com.factory.shape;

/**
 * @Author 李非凡
 * @Description: 长方形
 * @Date 2020/1/14 9:30
 * @Version 1.0
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
