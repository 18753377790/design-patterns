package com.factory;

/**
 * @Author 李非凡
 * @Description: 生产男性八卦炉
 * @Date 2020/9/23 15:00
 * @Version 1.0
 */
public class MaleFactory implements HumanFactory {

    /**
     * 生产出黄人男性
     * @return
     */
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    /**
     * 生产出白人男性
     * @return
     */
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    /**
     * 生产出黑人男性
     * @return
     */
    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
