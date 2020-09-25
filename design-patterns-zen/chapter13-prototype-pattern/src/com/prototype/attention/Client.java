package com.prototype.attention;

/**
 * @Author 李非凡
 * @Description: 简单的场景类
 * 构造函数不会被执行
 * 一个实现了Cloneable并重写了clone方法的类A，有一个无参构造或有参构造B，
 * 通过 new关键字产生了一个对象S，再然后通过S.clone()方式产生了一个新的对象T，
 * 那么在对象 拷贝时构造函数B是不会被执行的。
 * @Date 2020/9/25 16:14
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 产生一个对象
        Thing thing = new Thing();
        // 拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}
