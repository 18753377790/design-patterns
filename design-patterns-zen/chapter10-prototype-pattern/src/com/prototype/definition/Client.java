package com.prototype.definition;

/**
 * @Author 李非凡
 * @Description: 场景类
 * @Date 2020/9/24 8:47
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        // 调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
