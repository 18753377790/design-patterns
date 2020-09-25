package com.template;

/**
 * @Author 李非凡
 * @Description: 抽象悍马模型
 * @Date 2020/9/23 16:54
 * @Version 1.0
 */
public abstract class HummerModel {

    /**
     * 首先，这个
     */
    public abstract void start();

    /**
     * 能发动，还要能停下来，那才是真本事
     */
    public abstract void stop();

    /**
     * 喇叭会出声音，是滴滴叫，还是哔哔叫
     */
    public abstract void alarm();

    /**
     * 引擎会轰隆隆地响，不响那是假的
     */
    public abstract void engineBoom();

    /**
     * 那模型应该会跑吧，别管是人推的，还是电力驱动的，总之要会跑
     */
    public abstract void run();
}
