package com.factory;

/**
 * @Author 李非凡
 * @Description: 生产女性八卦炉
 * @Date 2020/9/23 14:59
 * @Version 1.0
 */
public class FemaleFactory implements HumanFactory{

    /**
     * 生产出黄人女性
     * @return
     */
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    /**
     * 生产出白人女性
     * @return
     */
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    /**
     * 生产出黑人女性
     * @return
     */
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
