package com.proxy;

/**
 * @Author 李非凡
 * @Description: 游戏者接口
 * @Date 2020/9/24 14:10
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
}
