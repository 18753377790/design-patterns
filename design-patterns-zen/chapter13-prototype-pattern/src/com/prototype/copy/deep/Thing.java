package com.prototype.copy.deep;

import java.util.ArrayList;

/**
 * @Author 李非凡
 * @Description: 深拷贝
 * @Date 2020/9/25 16:39
 * @Version 1.0
 */
public class Thing implements Cloneable {

    /**
     * 定义一个私有变量
     * 注意此处不要叫final关键字，对象的clone与对象内的final关键字是有冲突的
     * 要使用clone方法，类的成员变量上不要增加final关键字。
     */
    private ArrayList<String> arrayList = new ArrayList<>();

    /**
     * 该方法就实现了完全的拷贝，两个对象之间没有任何的瓜葛了，你修改你的，我修改我的，不相互影响，这种拷贝就叫做深拷贝。
     * @return 深拷贝类
     */
    @Override
    public Thing clone() {
        Thing thing = null;

        try {
            thing = (Thing) super.clone();
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
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
