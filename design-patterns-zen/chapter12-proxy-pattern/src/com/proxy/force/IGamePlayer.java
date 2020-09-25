package com.proxy.force;

/**
 * @Author 李非凡
 * @Description: 强制代理的接口类
 * @Date 2020/9/25 9:57
 * @Version 1.0
 */
public interface IGamePlayer {
    /**
     * 登录游戏
     * @param user 用户名
     * @param password 密码
     */
    void login(String user, String password);

    /**
     * 杀怪，网络游戏的主要特色
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();

    /**
     * 每个人都可以找一下自己的代理
     * @return 强制代理接口
     */
    IGamePlayer getProxy();
}
