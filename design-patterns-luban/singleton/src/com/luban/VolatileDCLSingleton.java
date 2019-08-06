package com.luban;

/**
 * @Author 李非凡
 * @Description:
 * Volatile加双重检查锁单例模式
 * 线程安全性：安全
 * 懒加载：是
 * 性能；比较好
 * @Date 2018/9/26 22:48
 * @Version 1.0
 */
public class VolatileDCLSingleton {

    /**
     *
     */
    private volatile static VolatileDCLSingleton instance = null;

    private VolatileDCLSingleton(){

    }

    /**
     *
     * @return
     */
    public static VolatileDCLSingleton getInstance(){
        if (null == instance)
            synchronized (VolatileDCLSingleton.class){
                if (null == instance)
                    instance = new VolatileDCLSingleton();
            }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(VolatileDCLSingleton.getInstance());
            }).start();
        }
    }
}
