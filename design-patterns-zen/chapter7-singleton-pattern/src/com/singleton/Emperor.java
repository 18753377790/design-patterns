package com.singleton;

/**
 * @Author 李非凡
 * @Description: 皇帝类
 * @Date 2019/8/6 19:27
 * @Version 1.0
 */
public class Emperor {

    /**
     * 初始化一个皇帝
     */
    private static final Emperor EMPEROR = new Emperor();

    /**
     * 构造方法私有化
     * 世俗和道德约束你，目的就是不希望产生第二个皇帝
     */
    private Emperor() {

    }

    /**
     * 对外暴露的皇帝
     * @return 皇帝
     */
    public static Emperor getInstance(){
        return EMPEROR;
    }

    /**
     * 皇帝发话了
     */
    public static void say() {
        System.out.println("我就是皇帝李非凡");
    }

    /**
     *
     */
    public void method() {

    }
}
