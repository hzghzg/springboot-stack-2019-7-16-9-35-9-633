package com.tw.apistackbase.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employee{
    private int id;
    private String name;
    private int age;
    private String gender;
    private int salary;

    public Employee(int id, String name, int age, String gender, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee() {

    }

    public static List<Employee> initialEmployeesList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(4, "alibaba1", 20, "male", 6000));
        employeeList.add(new Employee(11, "tengxun2", 19, "female", 7000));
        employeeList.add(new Employee(6, "alibaba3", 19, "male", 8000));
        return employeeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
