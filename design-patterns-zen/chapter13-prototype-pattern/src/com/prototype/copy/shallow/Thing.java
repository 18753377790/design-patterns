package com.prototype.copy.shallow;

import java.util.ArrayList;

/**
 * @Author 李非凡
 * @Description: 浅拷贝
 * @Date 2020/9/25 16:29
 * @Version 1.0
 */
public class Thing implements Cloneable {

    /**
     * 定义一个私有变量
     */
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public Thing clone() {
        Thing thing = null;

        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return thing;
    }

    /**
     * /设置ArrayList的值
     * @param value 设置的值
     */
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    /**
     * 取得arrayList的值
     * @return 获取到的值
     */
    public ArrayList<String> getValue() {
        return arrayList;
    }
}
