package com.template.extend;

/**
 * @Author 李非凡
 * @Description: 扩展后的抽象模板类
 * @Date 2020/9/24 8:52
 * @Version 1.0
 */
public abstract class HummerModel {

    /**
     * 首先
     */
    protected abstract void start();

    /**
     * 能发动，还要能停下来，那才是真本事
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
     * 那模型应该会跑吧，别管是人推的，还是电力驱动的，总之要会跑
     */
    final public void run() {
        // 先发动汽车
        this.start();
        // 引擎开始轰鸣
        this.engineBoom();
        // 要让它叫的时候就叫，喇叭不想让它响就不响
        if (this.isAlarm()) {
            this.alarm();
        }
        // 到达目的地就停车
        this.stop();
    }

    /**
     * 钩子方法，默认喇叭是会响的
     * @return 喇叭是否会响
     */
    protected boolean isAlarm() {
        return true;
    }
}
