package com.proxy.extend;

import com.proxy.IGamePlayer;

/**
 * @Author 李非凡
 * @Description: 普通代理的代理者
 * @Date 2020/9/25 9:04
 * @Version 1.0
 */
public class GamePlayerProxy implements IGamePlayer {

    /**
     * 游戏者接口
     */
    private IGamePlayer gamePlayer = null;

    /**
     * 通过构造函数传递要对谁进行代练
     * @param name 名称
     */
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
