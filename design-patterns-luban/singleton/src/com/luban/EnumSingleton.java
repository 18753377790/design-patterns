package com.luban;

/**
 * @Author 李非凡
 * @Description:
 * 枚举单例模式
 * 线程安全性：安全
 * 懒加载：否
 * 性能：好
 * 应用广泛
 * @Date 2018/9/26 23:33
 * @Version 1.0
 */
public enum EnumSingleton {
    INSTANCE;

    /**
     *
     * @return
     */
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
