package com.microkey.microkeyapp.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeNames {

	static List<String> nameOfEmployees = new ArrayList<String>();
		
	static {
		nameOfEmployees.add("Alex Smith");
		nameOfEmployees.add("Bill Shannon");
		nameOfEmployees.add("Steve Demory");
	}
	
    @Value("${employee.name}")
    private String employeeName;
    
    @GetMapping("/returnname")
    public List<String> employeeList(){
    	nameOfEmployees.add(employeeName);
        return nameOfEmployees;
    }
}
