package com.factory.multi;

import com.factory.BlackHuman;
import com.factory.Human;

/**
 * @Author 李非凡
 * @Description: 黑色人种的创建工厂
 * @Date 2020/9/23 11:28
 * @Version 1.0
 */
public class BlackHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
