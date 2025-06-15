package com.muhammetakduman.services;

import com.muhammetakduman.model.Employee;
import com.muhammetakduman.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAllEmplyoeeList(){
        return employeeRepository.getAllEmployeeList();
    }

    public Employee getEmplyoeeById(String id){
        return employeeRepository.getEmplyoeeById(id);
    }
}
