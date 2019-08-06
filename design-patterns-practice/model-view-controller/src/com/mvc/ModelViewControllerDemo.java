package com.mvc;

/**
 * @Author 李非凡
 * @Description:
 *
 * @Date 2019/7/10 17:28
 * @Version 1.0
 */
public class ModelViewControllerDemo {

    /**
     * 从数据库检索（retrieve）学生信息
     * @return
     */
    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

    public static void main(String[] args) {
        // 从数据可获取学生记录
        Student model  = retrieveStudentFromDatabase();
        // 创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
        // 更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }
}
