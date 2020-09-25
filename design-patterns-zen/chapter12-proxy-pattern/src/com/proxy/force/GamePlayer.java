package com.proxy.force;

/**
 * @Author 李非凡
 * @Description: 强制代理的真实角色
 * @Date 2020/9/25 9:59
 * @Version 1.0
 */
public class GamePlayer implements IGamePlayer{

    /**
     * 名称
     */
    private String name = "";

    /**
     * 我的代理是谁
     */
    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    /**
     * 找到自己的代理
     * @return 强制代理接口
     */
    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    /**
     * 进游戏之前你肯定要登录吧，这是一个必要条件
     * @param user 用户名
     * @param password 密码
     */
    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    /**
     * 打怪，最期望的就是杀老怪
     */
    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    /**
     * 升级，升级有很多方法，花钱买是一种，做任务也是一种
     */
    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + " 又升了一级！");
        }else {
            System.out.println("请使用指定的代理访问");
        }
    }

    /**
     * 校验是否是代理访问
     * @return 是否是代理访问
     */
    private boolean isProxy() {
        // if (this.proxy == null) return false; else return true;
        return this.proxy != null;
    }
}
