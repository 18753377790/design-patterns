package com.luban;

/**
 * @Author 李非凡
 * @Description:
 * 同步代码块懒汉式单例
 * 线程安全性：不安全，不能保证实例对象的唯一性
 * 懒加载：是
 * 性能：比较好
 * @Date 2018/9/23 18:04
 * @Version 1.0
 */
public class SynchronizedLazySingle2 {
    private static SynchronizedLazySingle2 instance = null;
    private SynchronizedLazySingle2(){

    }

    public static SynchronizedLazySingle2 getInstance(){
        if (null==instance)//可能会出现两个线程一前一后通过这里的情况
            synchronized (SynchronizedLazySingle2.class){
                instance= new SynchronizedLazySingle2();
            }
            return instance;
    }

    public static void main(String[] args) {
        System.out.println(SynchronizedLazySingle2.getInstance());
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(SynchronizedLazySingle2.getInstance());
            }).start();
        }
    }
}
