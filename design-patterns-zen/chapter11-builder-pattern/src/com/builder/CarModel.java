package com.builder;

import java.util.ArrayList;

/**
 * @Author 李非凡
 * @Description: 车辆模型的抽象类
 * @Date 2020/9/24 10:19
 * @Version 1.0
 */
public abstract class CarModel {

    /**
     * 这个参数是各个基本方法执行的顺序
     */
    private ArrayList<String> sequence = new ArrayList<>();

    /**
     * 模型是启动开始跑了
     */
    protected abstract void start();

    /**
     * 能发动，那还要能停下来，那才是真本事
     */
    protected abstract void stop();

    /**
     * 喇叭会出声音，是滴滴叫，还是哔哔叫
     */
    protected abstract void alarm();

    /**
     * 引擎会轰隆隆地响，不响那是假的
     */
    protected abstract void engineBoom();

    /**
     * 那模型应该会跑吧，别管是人推的，还是电力驱动，总之要会跑
     */
    final public void run() {

        // 循环一遍，谁在前，就先执行谁（遍历集合建议用foreach循环代替for循环）
        for (String actionName : this.sequence) {
            if ("start".equalsIgnoreCase(actionName)) {
                // 开启汽车
                this.start();
            } else if ("stop".equalsIgnoreCase(actionName)) {
                // 停止汽车
                this.stop();
            } else if ("alarm".equalsIgnoreCase(actionName)) {
                // 喇叭开始叫了
                this.alarm();
            } else if ("engine boom".equalsIgnoreCase(actionName)) {
                // 引擎开始轰鸣
                this.engineBoom();
            }
        }

    }

    /**
     * 把传递过来的值传递到类内
     * @param sequence 基本方法执行顺序序列
     */
    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
