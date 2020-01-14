package com.bridge;

/**
 * @Author 李非凡
 * @Description:
 * 圆形
 * @Date 2019/7/10 17:58
 * @Version 1.0
 */
public class Circle extends AbstractShape{

    /**
     *  x轴坐标
     */

    private int x;

    /**
     * y轴坐标
     */
    private int y;

    /**
     * 半径
     */
    private int radius;

    /**
     * 构造方法
     * @param x
     * @param y
     * @param radius
     * @param drawApi
     */
    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
