package com.luban;

/**
 * @Author 李非凡
 * @Description:懒汉式单例
 * 线程安全性：不安全，不能保证实例对象的唯一性
 * 懒加载：是
 * 性能：好
 * @Date 2018/9/23 16:13
 * @Version 1.0
 */
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (null==instance) //可能会出现两个线程一前一后通过这里的情况
            instance = new LazySingleton();
        return instance;
    }


    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance());
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(LazySingleton.getInstance());
            }).start();
        }
    }

}
