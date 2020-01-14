package com.factory.shape;

import com.factory.AbstractFactory;
import com.factory.FactoryEnum;
import com.factory.color.Color;

/**
 * @Author 李非凡
 * @Description: 形状工厂
 * @Date 2020/1/14 9:29
 * @Version 1.0
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if(FactoryEnum.CIRCLE.getValue().equalsIgnoreCase(shape)){
            return new Circle();
        } else if(FactoryEnum.RECTANGLE.getValue().equalsIgnoreCase(shape)){
            return new Rectangle();
        } else if(FactoryEnum.SQUARE.getValue().equalsIgnoreCase(shape)){
            return new Square();
        }
        return () -> System.out.println("NULL");
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
