package com.builder;

/**
 * @Author 李非凡
 * @Description: 导演类的场景类
 * @Date 2020/9/24 17:54
 * @Version 1.0
 */
public class ClientDirector {

    public static void main(String[] args) {
        Director director = new Director();

        // 1万量A类型的奔驰车
        for (int i = 0; i < 10000; i++) {
            director.getBenzModelA().run();
        }

        // 100万量B类型的奔驰车
        for (int i = 0; i < 1000000; i++) {
            director.getBenzModelB().run();
        }

        // 1000万量C类型的宝马车
        for (int i = 0; i < 10000000; i++) {
            director.getBmwModelC().run();
        }
    }
}
