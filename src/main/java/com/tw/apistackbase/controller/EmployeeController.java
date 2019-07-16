package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {


    @GetMapping
    public List<Employee> getEmployees(){
    }
}
