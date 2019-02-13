package com.university.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.university.student.model.Employee;
import com.university.student.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	 //-------------------Retrieve All Users--------------------------------------------------------
	
    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> listAllUsers() {
        List<Employee> emps = employeeService.findAllEmployees();
        if(emps.isEmpty()){
            return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Employee>>(emps, HttpStatus.OK);
    }
    
 
}
