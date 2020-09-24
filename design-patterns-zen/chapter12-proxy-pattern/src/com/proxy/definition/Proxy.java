package com.proxy.definition;

/**
 * @Author 李非凡
 * @Description: 代理类
 * 代理模式的核心就在代理类上
 * @Date 2020/9/24 15:16
 * @Version 1.0
 */
public class Proxy implements Subject {

    /**
     * 要代理实现哪个类
     */
    private Subject subject;

    /**
     * 默认被代理者
     */
    public Proxy() {
        this.subject = new Proxy();
    }

    /**
     * 通过构造函数传递代理者
     * @param subject 代理者
     */
    public Proxy(Subject subject) {
        this.subject = subject;
    }

    /**
     * 实现接口中定义的方法
     */
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    /**
     * 预处理
     */
    private void before() {
        // doSomething
    }

    /**
     * 善后处理
     */
    private void after() {
        // doSomething
    }
}
