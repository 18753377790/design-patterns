package com.luban;

/**
 * @Author 李非凡
 * @Description:
 * 同步方法懒汉式单例
 * 线程安全性：安全
 * 懒加载：是
 * 性能：加了synchronized，退化到串行执行，不好
 * @Date 2018/9/23 17:42
 * @Version 1.0
 */
public class SynchronizedLazySingleton {
    private static SynchronizedLazySingleton instance = null;
    private SynchronizedLazySingleton(){

    }

    private static synchronized SynchronizedLazySingleton getInstance(){
        if (null==instance)
            instance = new SynchronizedLazySingleton();
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(SynchronizedLazySingleton.getInstance());
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(SynchronizedLazySingleton.getInstance());
            }).start();
        }
    }
}
