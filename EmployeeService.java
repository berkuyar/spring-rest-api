package com.berkuyar.api_rest_spring.services;

import com.berkuyar.api_rest_spring.model.Employee;
import com.berkuyar.api_rest_spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployeeList(){
    return employeeRepository.getAllEmployeeList();
    }
}
