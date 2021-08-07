package com.example.jpa.controller;

import com.example.jpa.model.Employee;
import com.example.jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(path = "/insert")
    public List<Employee> insertEmploy(@RequestBody  List<Employee> employees){
        return employeeService.insert(employees);
    }

    @GetMapping(path = "/jpaRepository")
    public List<Employee> jpaRepository(){
        return employeeService.getAllEmployee();
    }

    @GetMapping(path = "/jpaStreamer")
    public List<Employee> jpaStreamer(){
        return employeeService.getAllEmployees();
    }

}
