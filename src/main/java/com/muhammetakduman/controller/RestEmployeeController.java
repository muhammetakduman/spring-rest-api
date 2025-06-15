package com.muhammetakduman.controller;


import com.muhammetakduman.model.Employee;
import com.muhammetakduman.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.util.List;

@RestController
//Kök Path
@RequestMapping("/rest/api")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employee-list")
    public List<Employee> getAllEmployeeList(){
        return employeeService.getAllEmplyoeeList();

    }

    @GetMapping(path = "/employee-list/{id}")
    public Employee getEmplyoeeById(@PathVariable(name = "id", required = true) String id){
        return employeeService.getEmplyoeeById(id);
    }
}
