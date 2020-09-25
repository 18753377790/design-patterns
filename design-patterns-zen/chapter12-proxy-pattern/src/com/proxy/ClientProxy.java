package com.proxy;

/**
 * @Author 李非凡
 * @Description: 改进后的场景类（增加代理模式）
 * @Date 2020/9/24 15:01
 * @Version 1.0
 */
public class ClientProxy {

    public static void main(String[] args) {
        // 定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        // 然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);
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
