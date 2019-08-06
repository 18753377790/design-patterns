package com.bridge;

/**
 * @Author 李非凡
 * @Description:
 * 画图工具接口
 * @Date 2019/7/10 17:13
 * @Version 1.0
 */
public interface DrawAPI {
    /**
     * 画圆方法，需要半径，x坐标，y坐标
     * @param radius
     * @param x
     * @param y
     */
    void drawCircle(int radius, int x, int y);
}
