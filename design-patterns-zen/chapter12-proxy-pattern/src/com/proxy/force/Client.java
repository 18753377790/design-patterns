package com.proxy.force;

/**
 * @Author 李非凡
 * @Description: 直接访问真实角色
 * @Date 2020/9/25 11:09
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-08-25 10:45:00");
        player.login("zhangSan", "password");
        // 开始杀怪
        player.killBoss();
        // 升级
        player.upgrade();
        // 记录结束游戏时间
        System.out.println("结束时间是：2009-08-26 03:40:00");
    }
}
