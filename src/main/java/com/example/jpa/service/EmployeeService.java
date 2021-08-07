package com.example.jpa.service;

import com.example.jpa.model.Employee;
import com.example.jpa.repo.EmployeeRepository;
import com.speedment.jpastreamer.application.JPAStreamer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private JPAStreamer jpaStreamer;

    public List<Employee> insert(List<Employee> employees)
    {
        return employeeRepository.saveAll(employees);
    }

    public List<Employee> getAllEmployee() {
        LocalDateTime check = LocalDateTime.now();
        return employeeRepository.findAll();
    }

    public List<Employee> getAllEmployees() {
        return jpaStreamer.stream(Employee.class).collect(Collectors.toList());
    }

    public List<Employee> getTop10Employees()
    {
        return jpaStreamer.stream(Employee.class)
                                .sorted(Comparator.comparing(Employee::getAge).reversed())
                                .limit(10)
                                .collect(Collectors.toList());
    }

    public Employee getSecondOldestEmployee()
    {
        return jpaStreamer.stream(Employee.class)
                                .sorted(Comparator.comparing(Employee::getAge).reversed())
                                .limit(2)
                                .skip(1)
                                .collect(Collectors.toList())
                                .stream()
                                .findFirst()
                                .orElse(null);
    }

    public Map<String,Long> getRoleGroupByCount()
    {
        return jpaStreamer.stream(Employee.class)
                              .collect(Collectors.groupingBy(Employee::getRole,Collectors.counting()));
    }
}
