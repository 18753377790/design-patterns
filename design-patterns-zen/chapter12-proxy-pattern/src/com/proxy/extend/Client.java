package com.proxy.extend;

import com.proxy.IGamePlayer;

/**
 * @Author 李非凡
 * @Description: 普通代理的场景类
 * @Date 2020/9/25 9:42
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy("张三");
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-08-25 10:45:00");
        proxy.login("zhangSan", "password");
        // 开始杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录结束游戏时间
        System.out.println("结束时间是：2009-08-26 03:40:00");
    }
}
