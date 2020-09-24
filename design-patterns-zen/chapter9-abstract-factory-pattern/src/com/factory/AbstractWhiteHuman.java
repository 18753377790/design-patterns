package com.factory;

/**
 * @Author 李非凡
 * @Description: 白色人种
 * @Date 2020/9/23 14:40
 * @Version 1.0
 */
public abstract class AbstractWhiteHuman implements Human {

    /**
     * 白色人种的颜色是白色的
     */
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    /**
     * 白色人种讲话
     */
    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节。");
    }
}
