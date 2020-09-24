package com.factory;

/**
 * @Author 李非凡
 * @Description: 黑色人种
 * @Date 2020/9/23 9:24
 * @Version 1.0
 */
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
