package com.builder;

import java.util.ArrayList;

/**
 * @Author 李非凡
 * @Description: 宝马车组装者
 * @Date 2020/9/24 16:53
 * @Version 1.0
 */
public class BmwBuilder extends CarBuilder{

    /**
     * 宝马车模型
     */
    private BmwModel bmw = new BmwModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
