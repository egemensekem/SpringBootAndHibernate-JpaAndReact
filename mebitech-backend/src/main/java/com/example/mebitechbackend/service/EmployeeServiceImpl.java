package com.example.mebitechbackend.service;

import com.example.mebitechbackend.domain.Employee;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mebitechbackend.repository.EmployeeRepository;

import java.util.List;
import java.util.logging.Logger;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee get(Long id) {
        Employee employee = employeeRepository.findOne(id);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
       List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    @Override
    public void delete(Long id) {
        employeeRepository.delete(id);
    }

    @Override
    public Employee create(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return employee1;
    }

    @Override
    public Employee update(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return null;
    }
}
