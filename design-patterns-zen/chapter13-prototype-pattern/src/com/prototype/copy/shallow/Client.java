package com.prototype.copy.shallow;

/**
 * @Author 李非凡
 * @Description: 浅拷贝测试
 * Object类提供的方法clone只是拷贝本对象，其对象内部的数组、引用对象等都不拷贝，
 * 还是指向原生对象的内部元素地址，这种拷贝就叫做浅拷贝。
 * @Date 2020/9/25 16:34
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 产生一个对象
        Thing thing = new Thing();
        // 设置一个值
        thing.setValue("张三");
        // 拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }
}
