package com.proxy;

/**
 * @Author 李非凡
 * @Description: 游戏者
 * @Date 2020/9/24 14:12
 * @Version 1.0
 */
public class GamePlayer implements IGamePlayer {

    /**
     * 名称
     */
    private String name = "";

    /**
     * 通过构造函数传递名称
     * @param name 名称
     */
    public GamePlayer(String name) {
        this.name = name;
    }

    /**
     * 进游戏之前你肯定要登录吧，这是一个必要条件
     * @param user 用户名
     * @param password 密码
     */
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
    }

    /**
     * 打怪，最期望的就是杀老怪
     */
    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    /**
     * 升级，升级有很多方法，花钱买是一种，做任务也是一种
     */
    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！");
    }
}
