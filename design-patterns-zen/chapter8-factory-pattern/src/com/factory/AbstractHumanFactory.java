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
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends Human> T createHuman(Class<T> c);
}
