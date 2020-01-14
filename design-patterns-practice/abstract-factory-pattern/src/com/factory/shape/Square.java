package com.factory.shape;

/**
 * @Author 李非凡
 * @Description: 正方形
 * @Date 2020/1/14 9:30
 * @Version 1.0
 */
public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
