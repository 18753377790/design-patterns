package com.factory.color;

/**
 * @Author 李非凡
 * @Description: 蓝色
 * @Date 2020/1/14 9:28
 * @Version 1.0
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
