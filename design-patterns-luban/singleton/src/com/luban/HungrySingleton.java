package com.luban;

/**
 * @Author 李非凡
 * @Description:饿汉式单例
 * 1.线程安全性：
 * 在加载的过程中已经被实例化，所以只有这一次，线程安全的。
 * 2.懒加载：没有延迟加载，好长时间不适用，影响性能
 * 3.性能：比较好
 * @Date 2018/9/23 14:03
 * @Version 1.0
 */
public class HungrySingleton {
    //加载的时候就产生的实例对象
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){
    }

    private static HungrySingleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(HungrySingleton.getInstance());
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(HungrySingleton.getInstance());
            }).start();
        }
    }
}