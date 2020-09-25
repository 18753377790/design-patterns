package com.proxy.virtual;

import com.proxy.definition.RealSubject;
import com.proxy.definition.Subject;

/**
 * @Author 李非凡
 * @Description: 虚拟代理类
 * @Date 2020/9/25 11:22
 * @Version 1.0
 */
public class Proxy implements Subject{

    /**
     * 要代理哪个实现类
     */
    private Subject subject;

    /**
     * 实现接口中定义的方法
     */
    @Override
    public void request() {
        // 判断一下真实主题是否初始化
        if (subject == null) {
            subject = new RealSubject();
        }
        subject.request();
    }
}
