package com.factory;

/**
 * @Author 李非凡
 * @Description:
 * 图形工厂
 * @Date 2019/7/10 13:46
 * @Version 1.0
 */
public class ShapeFactory {

    /**
     * 使用getShape方法获取形状类型的对象。
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType){
        // 如果图形类型为空，则返回null
        if (shapeType == null){
            return null;
        }
        // 根据图形类型创建对应的图形实例对象
        if(ShapeEnum.CIRCLE.getValue().equalsIgnoreCase(shapeType)){
            return new Circle();
        } else if(ShapeEnum.RECTANGLE.getValue().equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if(ShapeEnum.SQUARE.getValue().equalsIgnoreCase(shapeType)){
            return new Square();
        }

        return null;
    }
}
