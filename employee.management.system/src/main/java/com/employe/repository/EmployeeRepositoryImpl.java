package com.employe.repository;

import com.employe.model.Employee;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Value("${name}")
    private String empName;
    @Value("${city}")
    private String empLocation;

    @Override
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        employee.setEmpNanme(empName);
        employee.setEmpLOcation(empLocation);
        employees.add(employee);
        return employees;
    }
}
