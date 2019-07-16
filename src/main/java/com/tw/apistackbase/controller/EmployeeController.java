package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/employees")
@RestController
public class EmployeeController {
    List<Employee> employeeList=new ArrayList<>();
    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployee(){
        return employeeList;
    }


}
