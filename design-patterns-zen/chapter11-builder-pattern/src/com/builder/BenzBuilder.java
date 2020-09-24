package com.builder;

import java.util.ArrayList;

/**
 * @Author 李非凡
 * @Description: 奔驰车组装者
 * @Date 2020/9/24 16:51
 * @Version 1.0
 */
public class BenzBuilder extends CarBuilder{

    /**
     * 奔驰车模型
     */
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
