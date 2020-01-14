package com.factory.color;

/**
 * @Author 李非凡
 * @Description: 绿色
 * @Date 2020/1/14 9:28
 * @Version 1.0
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
