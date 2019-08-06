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
     * 使用 getShape 方法获取形状类型的对象。
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType){
        // 如果图形类型为空，则返回null
        if (shapeType == null){
            return null;
        }
        // 根据图形类型创建对应的图形实例对象
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
