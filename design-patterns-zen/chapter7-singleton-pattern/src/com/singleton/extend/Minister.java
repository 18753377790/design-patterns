package com.singleton.extend;

/**
 * @Author 李非凡
 * @Description: 臣子参拜皇帝的过程
 * @Date 2020/9/23 8:46
 * @Version 1.0
 */
public class Minister {

    public static void main(String[] args) {
        int ministerNum = 5;

        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.println("第" + (i + 1) + "个大臣参拜的是：");
            emperor.say();
        }
    }
}
