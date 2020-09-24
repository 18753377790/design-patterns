package com.builder.definition;

/**
 * @Author 李非凡
 * @Description: 抽象建造者
 * @Date 2020/9/24 11:14
 * @Version 1.0
 */
public abstract class Builder {

    /**
     * 设置产品的不同部分，以获得不同的产品
     */
    public abstract void setPart();

    /**
     * 建造产品
     * @return 产品
     */
    public abstract Product buildProduct();
}
