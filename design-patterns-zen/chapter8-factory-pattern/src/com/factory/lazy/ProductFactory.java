package com.factory.lazy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 李非凡
 * @Description: 延迟加载的工厂类
 * @Date 2020/9/23 11:38
 * @Version 1.0
 */
public class ProductFactory {

    /**
     *
     */
    private static final Map<String, Product> prMap = new HashMap<>();

    /**
     *
     * @param type
     * @return
     */
    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;

        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        }else {
            if ("Product1".equals(type)) {
                product = new ConcreteProduct1();
            }else {
                product = new ConcreteProduct2();
            }
            // 同时把对象放到缓存容器中
            prMap.put(type, product);
        }

        return product;
    }
}
