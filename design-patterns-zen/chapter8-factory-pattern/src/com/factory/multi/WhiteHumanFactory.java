package com.factory.multi;

import com.factory.Human;
import com.factory.WhiteHuman;

/**
 * @Author 李非凡
 * @Description: 白色人种的创建类
 * @Date 2020/9/23 11:30
 * @Version 1.0
 */
public class WhiteHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
