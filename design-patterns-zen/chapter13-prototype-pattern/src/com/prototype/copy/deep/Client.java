package com.prototype.copy.deep;

/**
 * @Author 李非凡
 * @Description: 深拷贝测试
 * @Date 2020/9/25 16:53
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
