package org.example.restapi.controller;

import org.example.restapi.dto.EmployeeDto;
import org.example.restapi.model.Employee;
import org.example.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String CreateEmployee(@RequestBody EmployeeDto emp){
        return employeeService.createEmployee(emp);
    }

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployee(){
        return employeeService.getEmployee();
    }
    @GetMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public String deleteEmployee(@RequestParam String id){
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/getByID/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getByIdEmployee(@PathVariable String id){
        return employeeService.getByIdEmployee(id);
    }
}