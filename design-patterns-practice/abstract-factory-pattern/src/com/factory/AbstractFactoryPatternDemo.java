package com.factory;

import com.factory.color.Color;
import com.factory.shape.Shape;

/**
 * @Author 李非凡
 * @Description: 抽象工厂模式
 * 抽象工厂模式是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。
 * @Date 2020/1/13 15:03
 * @Version 1.0
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryEnum.SHAPE.getValue());

        if (shapeFactory != null) {
            // 获取形状为 Circle 的对象
            Shape circle = shapeFactory.getShape(FactoryEnum.CIRCLE.getValue());
            // 调用 Circle 的 draw 方法
            circle.draw();

            // 获取形状为 Square 的对象
            Shape square = shapeFactory.getShape(FactoryEnum.SQUARE.getValue());
            // 调用 Square 的 draw 方法
            square.draw();

            // 获取形状为 Rectangle 的对象
            Shape rectangle = shapeFactory.getShape(FactoryEnum.RECTANGLE.getValue());
            // 调用 Rectangle 的 draw 方法
            rectangle.draw();
        }

        // 获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryEnum.COLOR.getValue());

        if (colorFactory != null) {
            // 获取颜色为 Blue 的对象
            Color blue = colorFactory.getColor(FactoryEnum.BLUE.getValue());
            // 调用 Blue 的 fill 方法
            blue.fill();

            // 获取颜色为 Green 的对象
            Color green = colorFactory.getColor(FactoryEnum.GREEN.getValue());
            // 调用 Green 的 fill 方法
            green.fill();

            // 获取颜色为 Red 的对象
            Color red = colorFactory.getColor(FactoryEnum.RED.getValue());
            // 调用 Red 的 fill 方法
            red.fill();
        }
    }
}
