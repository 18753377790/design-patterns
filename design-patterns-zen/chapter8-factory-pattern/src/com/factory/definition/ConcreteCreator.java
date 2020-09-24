package com.factory.definition;

/**
 * @Author 李非凡
 * @Description: 具体工厂类
 * @Date 2020/9/23 10:07
 * @Version 1.0
 */
public class ConcreteCreator extends Creator{

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;

        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println();
        }

        return (T) product;
    }
}
