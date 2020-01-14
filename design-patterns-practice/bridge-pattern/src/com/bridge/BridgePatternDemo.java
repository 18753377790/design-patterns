package com.bridge;

/**
 * @Author 李非凡
 * @Description: 桥接模式
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * @Date 2019/7/10 16:32
 * @Version 1.0
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        AbstractShape redCircle = new Circle(100,100, 10, new RedCircle());
        AbstractShape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
