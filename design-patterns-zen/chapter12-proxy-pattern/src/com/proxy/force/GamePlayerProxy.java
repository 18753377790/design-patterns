package com.proxy.force;

/**
 * @Author 李非凡
 * @Description: 强制代理的代理类
 * @Date 2020/9/25 10:08
 * @Version 1.0
 */
public class GamePlayerProxy implements IGamePlayer{

    /**
     *
     */
    private IGamePlayer gamePlayer;

    /**
     * 构造函数传递用户名
     * @param gamePlayer 强制代理接口
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

    /**
     * 代理的代理暂时还没有，就是自己
     * @return 强制代理接口
     */
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
