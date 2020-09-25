package com.prototype.attention;

/**
 * @Author 李非凡
 * @Description: 简单的可拷贝对象
 * @Date 2020/9/25 16:08
 * @Version 1.0
 */
public class Thing implements Cloneable {

    public Thing() {
        System.out.println("构造函数被执行了...");
    }

    @Override
    public Thing clone() {
        Thing thing = null;

        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return thing;
    }
}
