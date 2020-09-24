package com.factory.definition;

/**
 * @Author 李非凡
 * @Description:TODE
 * @Date 2020/9/23 10:00
 * @Version 1.0
 */
public abstract class Creator {

    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String，Enum，Class等，当然也可以为空
     * @param c 产品类型
     * @param <T>
     * @return 产品
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
