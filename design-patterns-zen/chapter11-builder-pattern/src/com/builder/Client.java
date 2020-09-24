package com.builder;

import java.util.ArrayList;

/**
 * @Author 李非凡
 * @Description: 场景类
 * @Date 2020/9/24 10:31
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        /*

         */
        BenzModel benz = new BenzModel();
        // 存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        // 客户要求，run的时候先发动引擎
        sequence.add("engine boom");
        // 启动起来
        sequence.add("start");
        // 开了一段时间就停下来
        sequence.add("stop");
        // 把这个顺序赋予奔驰车
        benz.setSequence(sequence);
        benz.run();
    }
}
