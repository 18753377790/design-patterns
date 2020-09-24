package com.factory.definition;

/**
 * @Author 李非凡
 * @Description: 场景类
 * @Date 2020/9/23 10:07
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();

        Product product = creator.createProduct(ConcreteProduct1.class);
    }
}
