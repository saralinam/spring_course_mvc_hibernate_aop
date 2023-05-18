package com.lina.spring.mvc_hibernate_aop.service;

import com.lina.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
}
