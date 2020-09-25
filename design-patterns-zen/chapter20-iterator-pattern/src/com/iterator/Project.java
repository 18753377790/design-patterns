package com.iterator;

/**
 * @Author 李非凡
 * @Description: 项目信息的实现
 * @Date 2020/9/25 17:38
 * @Version 1.0
 */
public class Project implements IProject{

    /**
     * 项目名称
     */
    private String name = "";

    /**
     * 项目成员数量
     */
    private int num = 0;

    /**
     * 项目费用
     */
    private int cost = 0;

    /**
     * 定义一个构造函数，把所有老板需要看到的信息存储起来
     * @param name 项目名称
     * @param num 项目成员数量
     * @param cost 项目费用
     */
    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    /**
     * 得到项目的信息
     * @return 项目信息
     */
    @Override
    public String getProjectInfo() {
        String info = "";
        // 获得项目的名称
        info = info + "项目名称是：" + this.name;
        // 获得项目人数
        info = info + "\t项目人数: "+ this.num;
        //项目费用
        info = info+ "\t 项目费用："+ this.cost;
        return info;
    }
}
