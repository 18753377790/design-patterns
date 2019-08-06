package com.bridge;

/**
 * @Author 李非凡
 * @Description:
 * 图形抽象类
 * @Date 2019/7/10 18:06
 * @Version 1.0
 */
public abstract class Shape {

    //
    protected DrawAPI drawAPI;

    /**
     *
     * @param drawAPI
     */
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    /**
     *
     */
    public abstract void draw();
}
