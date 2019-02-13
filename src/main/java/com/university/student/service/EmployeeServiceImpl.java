package com.university.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.student.exception.ResourceNotFoundException;
import com.university.student.model.Employee;
import com.university.student.model.Student;
import com.university.student.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }


	
}
