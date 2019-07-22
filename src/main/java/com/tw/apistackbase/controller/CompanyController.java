package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Company;
import com.tw.apistackbase.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Company")
public class CompanyController {

    List<Company> companyList=Company.initialCompany();


    @PostMapping("/{id}/empolyees")
    public Company addEmployee(@PathVariable("id") int id,@RequestBody Employee employee){
        companyList.stream().filter(item->item.getId()==id).collect(Collectors.toList());
        if(companyList.size()==0){
            return null;
        }
        else{
            int sum=0;
            int maleCount=0;
            int femaleCount=0;
            for (Employee e:companyList.get(0).getEmployeeList()) {
                sum+=e.getSalary();
                if(e.getGender()=="male"){
                    maleCount++;
                }
                else{
                    femaleCount++;
                }
            }
            if(companyList.get(0).getCost()-sum>employee.getSalary()&& Math.abs(maleCount-femaleCount)<=3){

                companyList.get(0).getEmployeeList().add(employee);
                return companyList.get(0);
            }
            else
                return  null;
        }
    }

}
