package com.muhammetakduman.config;


import com.muhammetakduman.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1","Muhammet","Akduman"));
        employeeList.add(new Employee("2","Fatma","Yaprak"));
        employeeList.add(new Employee("3","Baran","Yıldız"));
        employeeList.add(new Employee("4","Emirhan","ÇorabıKirli"));

        return employeeList;
    };
}
