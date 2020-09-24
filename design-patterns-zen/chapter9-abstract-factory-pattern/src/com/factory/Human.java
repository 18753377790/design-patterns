package com.factory;

/**
 * @Author 李非凡
 * @Description: 人种接口
 * @Date 2020/9/23 14:37
 * @Version 1.0
 */
public interface Human {

    /**
     * 每个人种都有相应的颜色
     */
    void getColor();

    /**
     * 人类会说话
     */
    void talk();

    /**
     * 每个人都有性别
     */
    void getSex();
}
