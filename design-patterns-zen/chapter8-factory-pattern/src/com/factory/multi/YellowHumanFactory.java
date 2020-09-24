package com.factory.multi;

import com.factory.Human;
import com.factory.YellowHuman;

/**
 * @Author 李非凡
 * @Description: 黄色人种的创建类
 * @Date 2020/9/23 11:29
 * @Version 1.0
 */
public class YellowHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
