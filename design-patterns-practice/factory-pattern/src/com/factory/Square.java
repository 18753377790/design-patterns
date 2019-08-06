package com.factory;

/**
 * @Author 李非凡
 * @Description:
 * 正方形
 * @Date 2019/7/10 13:56
 * @Version 1.0
 */
public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
