package com.bridge;

/**
 * @Author 李非凡
 * @Description:
 * 绿色圆
 * @Date 2019/7/10 17:12
 * @Version 1.0
 */
public class GreenCircle implements DrawApi{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " +x+", "+ y +"]");
    }
}
