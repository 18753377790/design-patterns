package com.template.definition;

/**
 * @Author 李非凡
 * @Description: 抽象模板类
 * @Date 2020/9/24 8:44
 * @Version 1.0
 */
public abstract class AbstractClass {

    /**
     * 基本方法
     */
    protected abstract void doSomething();

    /**
     * 基本方法
     */
    protected abstract void doAnything();

    /**
     * 模板方法
     */
    public void templateMethod() {
        // 调用基本方法，完成相关的逻辑
        this.doSomething();
        this.doAnything();
    }
}
