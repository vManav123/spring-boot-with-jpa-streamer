package com.example.jpa.repo;

import com.example.jpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface EmployeeRepository extends JpaRepository<Employee, BigInteger> {
}
