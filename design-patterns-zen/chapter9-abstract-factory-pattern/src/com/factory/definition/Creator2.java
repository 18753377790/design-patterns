package com.factory.definition;

/**
 * @Author 李非凡
 * @Description: 产品等级2的实现类
 * @Date 2020/9/23 16:24
 * @Version 1.0
 */
public class Creator2 extends AbstractCreator{

    /**
     * 只生产产品等级为2的A产品
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    /**
     * 只生产产品等级为2的B产品
     * @return
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
