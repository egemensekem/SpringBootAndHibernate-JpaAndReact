package com.example.mebitechbackend.service;

import com.example.mebitechbackend.domain.Employee;

import java.util.List;

/**
 * Created by egemensekem on 3/1/2018.
 */

public interface EmployeeService {

    public Employee get(Long id);
    public List<Employee> getAll();
    public void delete(Long id);
    public Employee create(Employee employee);
    public Employee update(Employee employee);

}
