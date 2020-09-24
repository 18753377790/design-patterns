package com.factory.definition;

/**
 * @Author 李非凡
 * @Description: 产品等级1的实现类
 * @Date 2020/9/23 16:21
 * @Version 1.0
 */
public class Creator1 extends AbstractCreator{

    /**
     * 只生产产品等级为1的A产品
     * @return
     */
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    /**
     * 只生产产品等级为1的B产品
     * @return
     */
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
