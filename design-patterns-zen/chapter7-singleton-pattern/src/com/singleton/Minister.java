package com.singleton;

/**
 * @Author 李非凡
 * @Description: 大臣类
 * @Date 2019/8/6 19:27
 * @Version 1.0
 */
public class Minister {

    public static void main(String[] args) {

        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }

    }
}
