package com.template.extend;

/**
 * @Author 李非凡
 * @Description: 扩展后的H1悍马
 * @Date 2020/9/24 9:04
 * @Version 1.0
 */
public class HummerH1Model extends HummerModel{

    /**
     * 要响喇叭
     */
    private boolean alarmFlag = true;

    @Override
    protected void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    /**
     * 要不要响喇叭，是有客户的来决定的
     * @param isAlarm 喇叭是否会响
     */
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }
}
