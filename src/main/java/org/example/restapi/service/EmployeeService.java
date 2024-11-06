package org.example.restapi.service;

import org.example.restapi.dto.EmployeeDto;
import org.example.restapi.model.Employee;
import org.example.restapi.repositary.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String createEmployee(EmployeeDto employeeDto){
        try{
            Employee emp = Employee.builder().
                            name(employeeDto.getName())
                            .salary(employeeDto.getSalary())
                            .empId(employeeDto.getEmpId())
                            .location(employeeDto.getLocation()).build();
            employeeRepository.save(emp);

        }catch(Exception e){

        }
        return "Successfully created.. :) ";

    }
    public List<Employee> getEmployee(){
        List<Employee> emplist = new ArrayList<>();
        try{
            emplist = employeeRepository.findAll();

        }catch(Exception e){

        }
        return emplist;

    }
    public String deleteEmployee(String id){
//        List<Employee> emplist = new ArrayList<>();
        try{
            employeeRepository.deleteById(id);

        }catch(Exception e){

        }
        return "Record Deleted...!";
    }
    public Employee getByIdEmployee(String id){

        Employee empd = null;

        try {
            // `findById` returns an Optional, so handle it properly
            empd = employeeRepository.findById(id)
                    .orElse(null);
        } catch (Exception e) {

        }
        return empd;
    }
}
