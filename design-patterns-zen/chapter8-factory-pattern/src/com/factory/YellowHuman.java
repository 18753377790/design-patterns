package com.factory;

/**
 * @Author 李非凡
 * @Description: 黄色人种
 * @Date 2020/9/23 9:24
 * @Version 1.0
 */
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }
}
