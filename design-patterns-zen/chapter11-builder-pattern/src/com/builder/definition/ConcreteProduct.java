package com.builder.definition;

/**
 * @Author 李非凡
 * @Description: 具体建造者
 * @Date 2020/9/24 11:22
 * @Version 1.0
 */
public class ConcreteProduct extends Builder{

    /**
     * 新建产品
     */
    private Product product = new Product();

    /**
     * 设置产品零件
     */
    @Override
    public void setPart() {
        // 产品类内的逻辑处理
    }

    /**
     * 组建一个产品
     * @return 新建产品
     */
    @Override
    public Product buildProduct() {
        return product;
    }
}
