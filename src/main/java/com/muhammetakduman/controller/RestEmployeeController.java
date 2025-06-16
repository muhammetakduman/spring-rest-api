package com.muhammetakduman.controller;


import com.muhammetakduman.model.Employee;
import com.muhammetakduman.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
//Kök Path
@RequestMapping("/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployeeList(){
        return employeeService.getAllEmplyoeeList();

    }

    @GetMapping(path = "/list/{id}")
    public Employee getEmplyoeeById(@PathVariable(name = "id", required = true) String id){
        return employeeService.getEmplyoeeById(id);
    }

    @GetMapping(path = "employee-list-with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName") String firstName,
                                                @RequestParam(name ="lastName") String lastName){
        return null;
    }

}
