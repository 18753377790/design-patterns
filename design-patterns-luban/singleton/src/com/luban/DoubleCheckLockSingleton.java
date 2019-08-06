package com.luban;

/**
 * @Author 李非凡
 * @Description:
 * 双重检查锁懒汉式式单例
 * 线程安全性：安全
 * 懒加载：是
 * 性能：比较好
 * 问题：因为指令重排引起空指针异常
 * @Date 2018/9/23 18:06
 * @Version 1.0
 */
public class DoubleCheckLockSingleton {

    /**
     *
     */
    private static DoubleCheckLockSingleton instance = null;

    private DoubleCheckLockSingleton(){

    }

    /**
     *
     * @return
     */
    public static DoubleCheckLockSingleton getInstance(){
        if (null == instance)
            synchronized (DoubleCheckLockSingleton.class){
                if (null == instance)
                    instance = new DoubleCheckLockSingleton();
            }
            return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(DoubleCheckLockSingleton.getInstance());
            }).start();
        }
    }
}
