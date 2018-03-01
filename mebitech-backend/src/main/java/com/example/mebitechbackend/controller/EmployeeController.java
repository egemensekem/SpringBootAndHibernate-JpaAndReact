package com.example.mebitechbackend.controller;

import com.example.mebitechbackend.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.mebitechbackend.service.EmployeeService;

import java.util.List;


@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/{id}")
    public Employee get(@PathVariable("id") Long id) {
        Employee employee = employeeService.get(id);
        return employee;
    }

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @DeleteMapping
    public void delete(@RequestBody Employee employee) {
        employeeService.delete(employee.getId());

    }

    @PutMapping(value = "/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {

        if (employee.getId() != null) {
            return employeeService.update(employee);

        }
        return null;


    }

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        Employee employee1 = employeeService.create(employee);
        return employee1;
    }


}
