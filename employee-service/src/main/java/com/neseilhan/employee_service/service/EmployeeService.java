package com.neseilhan.employee_service.service;

import com.neseilhan.employee_service.entity.Employee;
import com.neseilhan.employee_service.repository.EmployeeRepo;
import com.neseilhan.employee_service.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;

    public EmployeeResponse getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee, EmployeeResponse.class);
        return employeeResponse;
    }

}