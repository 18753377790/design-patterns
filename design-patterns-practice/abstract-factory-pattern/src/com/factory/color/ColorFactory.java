package com.factory.color;

import com.factory.AbstractFactory;
import com.factory.FactoryEnum;
import com.factory.shape.Shape;

/**
 * @Author 李非凡
 * @Description: 颜色工厂
 * @Date 2020/1/14 9:29
 * @Version 1.0
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(FactoryEnum.RED.getValue().equalsIgnoreCase(color)){
            return new Red();
        } else if(FactoryEnum.GREEN.getValue().equalsIgnoreCase(color)){
            return new Green();
        } else if(FactoryEnum.BLUE.getValue().equalsIgnoreCase(color)){
            return new Blue();
        }
        return () -> System.out.println("NULL");
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
