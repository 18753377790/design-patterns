package com.prototype.definition;

/**
 * @Author 李非凡
 * @Description:
 * 原型模式（Prototype Pattern）的简单程度仅次于单例模式和迭代器模式。
 *
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * 原型模式的核心是一个clone方法，通过该方法进行对象的拷贝，
 * Java 提供了一个Cloneable接口来标示这个对象是可拷贝的
 * @Date 2020/9/25 15:58
 * @Version 1.0
 */
public class PrototypeClass implements Cloneable{

    /**
     * 覆盖父类Object方法
     * @return 原型类
     */
    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;

        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototypeClass;
    }
}
