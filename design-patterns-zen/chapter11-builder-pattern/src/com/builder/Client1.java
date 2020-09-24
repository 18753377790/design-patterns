package com.builder;

import java.util.ArrayList;

/**
 * @Author 李非凡
 * @Description: 修改后的场景类，相同顺序的宝马车场景类
 * @Date 2020/9/24 17:17
 * @Version 1.0
 */
public class Client1 {

    public static void main(String[] args) {
        // 存放run的顺序
        ArrayList<String> sequence = new ArrayList<>();
        // 客户要求，run的时候先发动引擎
        sequence.add("engine boom");
        // 启动起来
        sequence.add("start");
        // 开了一段就停下来
        sequence.add("stop");

        // 要一个奔驰车
        BenzBuilder benzBuilder = new BenzBuilder();
        // 把这个顺序给这个builder类，制造出这也一个车来
        benzBuilder.setSequence(sequence);
        // 制造出一个奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        // 奔驰车跑一下看看
        benz.run();

        // 按照相同的顺序，我再要一个宝马
        BmwBuilder bmwBuilder = new BmwBuilder();
        bmwBuilder.setSequence(sequence);
        BmwModel bmw = (BmwModel) bmwBuilder.getCarModel();
        bmw.run();
    }
}
