package com.berkuyar.api_rest_spring.config;

import com.berkuyar.api_rest_spring.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
@Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee("1", "Berk", "Uyar"));
        employeeList.add(new Employee("2", "Ali", "Yılmaz"));
        employeeList.add(new Employee("3", "Volkan", "Demirel"));
        employeeList.add(new Employee("4", "Arda", "Güler"));
        employeeList.add(new Employee("5", "Can", "Demir"));

        return employeeList;
    }

}
