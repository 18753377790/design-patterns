package com.compostie;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 李非凡
 * @Description:TODE
 * @Date 2020/1/6 20:52
 * @Version 1.0
 */
public class Employee implements Serializable {

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String dept;

    /**
     *
     */
    private int salary;

    /**
     *
     */
    private List<Employee> subordinates;

    /**
     * 构造函数
     */
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
