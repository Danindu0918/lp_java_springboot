package com.employe.repository;

import com.employe.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> getAllEmployees();
}
