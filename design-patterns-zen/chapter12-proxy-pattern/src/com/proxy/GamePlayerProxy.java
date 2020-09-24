package com.proxy;

/**
 * @Author 李非凡
 * @Description: 代练者
 * @Date 2020/9/24 14:50
 * @Version 1.0
 */
public class GamePlayerProxy implements IGamePlayer {

    /**
     * 游戏者
     */
    private IGamePlayer gamePlayer;

    /**
     * 通过构造函数传递要对谁进行代练
     * @param gamePlayer 游戏者
     */
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    /**
     * 代练登录
     * @param user 用户名
     * @param password 密码
     */
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    /**
     * 代练杀怪
     */
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    /**
     * 代练升级
     */
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
