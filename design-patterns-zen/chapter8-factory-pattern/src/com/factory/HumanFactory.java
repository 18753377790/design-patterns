package com.factory;

/**
 * @Author 李非凡
 * @Description: 人类创建工厂
 * @Date 2020/9/23 9:32
 * @Version 1.0
 */
public class HumanFactory extends AbstractHumanFactory{

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        // 定义一个生产的人种
        Human human = null;

        try {
            // 产生一个人种
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }

        return (T)human;
    }
}
