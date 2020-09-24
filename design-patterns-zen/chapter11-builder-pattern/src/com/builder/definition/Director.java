package com.builder.definition;

/**
 * @Author 李非凡
 * @Description: 导演类
 * @Date 2020/9/24 11:26
 * @Version 1.0
 */
public class Director {

    /**
     * 建造者
     */
    private Builder builder = new ConcreteProduct();

    /**
     * 构建不同的产品
     * @return 新建产品
     */
    public Product getProductA() {
        builder.setPart();
        // 设置不同的零件，产生不同的产品
        return builder.buildProduct();
    }
}
