package com.factory;

import com.factory.color.ColorFactory;
import com.factory.shape.ShapeFactory;

/**
 * @Author 李非凡
 * @Description: 抽象工厂提供方
 * @Date 2020/1/14 9:31
 * @Version 1.0
 */
public class FactoryProducer {

    /**
     * 获取抽象工厂
     * @param choice
     * @return
     */
    public static AbstractFactory getFactory(String choice) {
        if (FactoryEnum.SHAPE.getValue().equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        }else if (FactoryEnum.COLOR.getValue().equalsIgnoreCase(choice)) {
            return new ColorFactory();
        }
        return null;
    }
}
