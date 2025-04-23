package com.berkuyar.api_rest_spring.controller;

import com.berkuyar.api_rest_spring.model.Employee;
import com.berkuyar.api_rest_spring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class RestEmployeeController {

    @Autowired
    private EmployeeService emploeyeService ;

@GetMapping(path= "/employee-list")
    public List<Employee> getAllEmployeeList(){

    return  emploeyeService.getAllEmployeeList();
    }
}
