package com.proxy.definition;

/**
 * @Author 李非凡
 * @Description: 真实主题类
 * RealSubject是一个正常的业务实现类
 * @Date 2020/9/24 15:14
 * @Version 1.0
 */
public class RealSubject implements Subject {

    /**
     * 实现方法
     */
    @Override
    public void request() {
        // 业务逻辑处理
    }
}
