package com.factory;

/**
 * @Author 李非凡
 * @Description: 抽象人类创建工厂
 * @Date 2020/9/23 9:31
 * @Version 1.0
 */
public abstract class AbstractHumanFactory {

    /**
     * 创建人类
     * @param c 人种类
     * @param <T> 泛型，Human类
     * @return 人种
     */
    public abstract <T extends Human> T createHuman(Class<T> c);
}
