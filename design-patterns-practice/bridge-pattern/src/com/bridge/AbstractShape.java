package com.bridge;

/**
 * @Author 李非凡
 * @Description:
 * 图形抽象类
 * @Date 2019/7/10 18:06
 * @Version 1.0
 */
public abstract class AbstractShape {

    /**
     *
     */
    protected DrawApi drawApi;

    /**
     * 构造方法
     * @param drawApi
     */
    protected AbstractShape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    /**
     * 画图方法
     */
    public abstract void draw();
}
