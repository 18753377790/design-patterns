package com.bridge;

/**
 * @Author 李非凡
 * @Description:
 * 圆形
 * @Date 2019/7/10 17:58
 * @Version 1.0
 */
public class Circle extends Shape{

    // x轴坐标
    private int x;
    // y轴坐标
    private int y;
    // 半径
    private int radius;

    /**
     * 构造方法
     * @param x
     * @param y
     * @param radius
     * @param drawAPI
     */
    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
