package com.mvc;

/**
 * @Author 李非凡
 * @Description:
 * 学生实体类（模型）
 * @Date 2019/7/10 17:28
 * @Version 1.0
 */
public class Student {
    // 登记号
    private String rollNo;
    // 姓名
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
