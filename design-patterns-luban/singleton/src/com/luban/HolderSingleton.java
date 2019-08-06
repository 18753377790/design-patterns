package com.luban;

/**
 * @Author 李非凡
 * @Description:
 * 静态内部类单例模式
 * 线程安全性：安全
 * 懒加载：是
 * 性能：好
 * 应用很广泛
 * @Date 2018/9/26 23:12
 * @Version 1.0
 */
public class HolderSingleton {

    private HolderSingleton(){

    }

    /**
     *
     */
    private static class Holder{
        private static HolderSingleton instance = new HolderSingleton();
    }

    /**
     *
     * @return
     */
    public static HolderSingleton getInstance(){
        return Holder.instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                System.out.println(HolderSingleton.getInstance());
            });
        }
    }
}
