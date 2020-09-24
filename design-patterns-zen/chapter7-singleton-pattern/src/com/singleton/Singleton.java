package com.singleton;

/**
 * @Author 李非凡
 * @Description: 单例模式（饿汉式）
 * 确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
 * @Date 2019/8/6 19:34
 * @Version 1.0
 */
public class Singleton {

    /**
     * final修饰的私有变量，常量
     */
    private static final Singleton SINGLETON = new Singleton();

    /**
     * 限制产生多个对象
     */
    private Singleton(){

    }

    /**
     * 通过该方法获得实例对象
     * @return 单例
     */
    public static Singleton getInstance(){
        return SINGLETON;
    }

    /**
     * 类中其他方法，尽量是static
     */
    public static void doSomething(){

    }

    /**
     *
     */
    public void method() {

    }
}
