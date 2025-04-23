package com.berkuyar.api_rest_spring.repository;

import com.berkuyar.api_rest_spring.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class EmployeeRepository {
    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getAllEmployeeList(){

        return null;
    }
}
