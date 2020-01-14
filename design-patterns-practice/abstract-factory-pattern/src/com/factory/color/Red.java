package com.factory.color;

/**
 * @Author 李非凡
 * @Description: 红色
 * @Date 2020/1/14 9:29
 * @Version 1.0
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
