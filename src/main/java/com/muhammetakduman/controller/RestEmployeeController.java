package com.muhammetakduman.controller;


import com.muhammetakduman.model.Employee;
import com.muhammetakduman.model.UpdateEmployeeRequest;
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

    @GetMapping(path = "/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName",required = false) String firstName,
                                                @RequestParam(name ="lastName" ,required = false) String lastName){
        return employeeService.getEmployeeWithParams(firstName,lastName);
    }

    @PostMapping(path = "/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee){
        return employeeService.saveEmployee(newEmployee);
    }


    @DeleteMapping(path = "/delete-employee/{id}")
    public boolean deleteEmployee(@PathVariable(name = "id") String id){
        if (id !=null){
            this.employeeService.deleteEmployee(id);
        }
        return true;
    }

    @PutMapping(path = "/update-employee/{id}")
    public Employee updateEmployee(@PathVariable(name = "id") String id , @RequestBody UpdateEmployeeRequest request){
        return employeeService.updateEmployee(id, request);
    }




}
