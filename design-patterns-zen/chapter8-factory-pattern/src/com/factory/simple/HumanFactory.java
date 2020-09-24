package com.factory.simple;

import com.factory.Human;

/**
 * @Author 李非凡
 * @Description: 简单工厂模式中的工厂类
 * @Date 2020/9/23 10:16
 * @Version 1.0
 */
public class HumanFactory {

    /**
     * 创建人类
     * @param c 人种类
     * @param <T>
     * @return 人种
     */
    public static <T extends Human> T createHuman(Class<T> c) {
        // 定义一个生产出的人种
        Human human = null;

        try {
            // 定义一个生产出的人种
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e) {
            System.out.println("人种生成错误！");
        }

        return (T) human;
    }
}
