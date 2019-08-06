package com.mvc;

/**
 * @Author 李非凡
 * @Description:
 * 学生视图
 * @Date 2019/7/10 17:27
 * @Version 1.0
 */
public class StudentView {
    /**
     * 打印学生信息
     * @param studentName
     * @param studentRollNo
     */
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
