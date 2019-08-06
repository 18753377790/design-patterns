package com.mvc;

/**
 * @Author 李非凡
 * @Description:
 * 学生控制器
 * @Date 2019/7/10 17:27
 * @Version 1.0
 */
public class StudentController {
    // 学生模型
    private Student model;
    // 学生视图
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    /**
     * 更新视图
     */
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
