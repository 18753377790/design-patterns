package com.factory;

import com.factory.color.Color;
import com.factory.shape.Shape;

/**
 * @Author 李非凡
 * @Description: 抽象工厂
 * @Date 2020/1/13 15:33
 * @Version 1.0
 */
public abstract class AbstractFactory {

    /**
     * 获取颜色
     * @param color
     * @return
     */
    public abstract Color getColor(String color);

    /**
     * 获取形状
     * @param shape
     * @return
     */
    public abstract Shape getShape(String shape);
}
