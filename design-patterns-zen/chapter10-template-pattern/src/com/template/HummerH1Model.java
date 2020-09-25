package com.template;

/**
 * @Author 李非凡
 * @Description: H1型号悍马模型
 * @Date 2020/9/23 17:06
 * @Version 1.0
 */
public class HummerH1Model extends HummerModel{

    /**
     *
     */
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    /**
     *
     */
    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    /**
     * H1型号的悍马车鸣笛
     */
    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    /**
     *
     */
    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    /**
     *
     */
    @Override
    public void run() {
        //
        this.start();
        //
        this.engineBoom();
        //
        this.alarm();
        //
        this.stop();
    }
}
