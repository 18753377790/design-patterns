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
     * 缓存容器
     */
    private static final Map<String, Product> PR_MAP = new HashMap<>();

    /**
     * 创建产品
     * @param type 产品类型
     * @return 产品
     */
    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;

        if (PR_MAP.containsKey(type)) {
            product = PR_MAP.get(type);
        }else {
            if ("Product1".equals(type)) {
                product = new ConcreteProduct1();
            }else {
                product = new ConcreteProduct2();
            }
            // 同时把对象放到缓存容器中
            PR_MAP.put(type, product);
        }

        return product;
    }
}
