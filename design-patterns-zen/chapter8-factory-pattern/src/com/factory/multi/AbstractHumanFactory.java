package com.factory.multi;

import com.factory.Human;

/**
 * @Author 李非凡
 * @Description: 多工厂模式的抽象工厂类
 * @Date 2020/9/23 11:21
 * @Version 1.0
 */
public abstract class AbstractHumanFactory {

    /**
     * 创建人类
     * @return
     */
    public abstract Human createHuman();
}
