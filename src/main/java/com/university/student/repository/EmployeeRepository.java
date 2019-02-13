package com.university.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.student.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
