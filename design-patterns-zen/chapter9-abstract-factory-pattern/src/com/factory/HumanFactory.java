package com.factory;

/**
 * @Author 李非凡
 * @Description: 八卦炉（人类工厂接口）定义
 * @Date 2020/9/23 14:55
 * @Version 1.0
 */
public interface HumanFactory {

    /**
     * 制造一个黄色人种
     * @return 黄色人种
     */
    Human createYellowHuman();

    /**
     * 制造一个白色人种
     * @return 白色人种
     */
    Human createWhiteHuman();

    /**
     * 制造一个黑色人种
     * @return 黑色人种
     */
    Human createBlackHuman();
}
