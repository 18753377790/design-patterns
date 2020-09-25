package com.template.extend;

/**
 * @Author 李非凡
 * @Description: 扩展后的H2悍马
 * @Date 2020/9/24 9:04
 * @Version 1.0
 */
public class HummerH2Model extends HummerModel{

    @Override
    protected void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    /**
     * 默认是没有喇叭的
     * @return 喇叭是否会响
     */
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
