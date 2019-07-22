package com.tw.apistackbase.model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private int cost;
    private int id;
    private  List<Employee> employeeList=new ArrayList<>();

    public Company() {

    }

    public Company(int cost, int id, List<Employee> employeeList) {
        this.cost = cost;
        this.id = id;
        this.employeeList = employeeList;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public static List<Company> initialCompany() {
        List<Employee> employeeList=Employee.initialEmployeesList();
        List<Company> companyListList = new ArrayList<>();
        Company company=new Company(25000,1,employeeList);
        companyListList.add(company);
        return companyListList;
    }
}
