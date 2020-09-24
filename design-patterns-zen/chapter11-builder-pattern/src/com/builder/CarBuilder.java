package com.builder;

import java.util.ArrayList;

/**
 * @Author 李非凡
 * @Description: 抽象汽车组装者
 * @Date 2020/9/24 16:41
 * @Version 1.0
 */
public abstract class CarBuilder {

    /**
     * 建造一个模型，你要给我一个顺序要求，就是组装顺序
     * @param sequence 组装顺序要求
     */
    public abstract void setSequence(ArrayList<String> sequence);

    /**
     * 设置完毕顺序后，就可以直接拿到这个车辆模型
     * @return 车辆模型
     */
    public abstract CarModel getCarModel();
}
