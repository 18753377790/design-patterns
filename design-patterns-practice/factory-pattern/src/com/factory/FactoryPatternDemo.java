package com.factory;

/**
 * @Author 李非凡
 * @Description:
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
 * 定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 *
 * 何时使用：我们明确地计划不同条件下创建不同实例时。
 *
 * 应用实例：
 * 1、您需要一辆汽车，可以直接从工厂里面提货，而不用去管这辆汽车是怎么做出来的，以及这个汽车里面的具体实现。
 * 2、一个调用者想创建一个对象，只要知道其名称就可以了。
 * 3、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 * 4、屏蔽产品的具体实现，调用者只关心产品的接口。
 * @Date 2019/7/10 13:48
 * @Version 1.0
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        // 获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape(ShapeEnum.CIRCLE.getValue());
        // 调用 Circle 的 draw 方法
        shape1.draw();
        // 获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape(ShapeEnum.RECTANGLE.getValue());
        // 调用 Rectangle 的 draw 方法
        shape2.draw();
        // 获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape(ShapeEnum.SQUARE.getValue());
        // 调用 Square 的 draw 方法
        shape3.draw();
    }
}
