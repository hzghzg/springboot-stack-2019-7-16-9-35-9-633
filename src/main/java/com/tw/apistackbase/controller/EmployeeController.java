package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    List<Employee> employeeList=Employee.initialEmployeesList();

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeList;
    }
}
