package com.spicekey.spicekeyspa.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleClassTest {

	static List<String> nameOfEmployees = new ArrayList<String>();
		
	static {
		nameOfEmployees.add("Raman Sharma");
		nameOfEmployees.add("Anamika Sharma");
		nameOfEmployees.add("Kala Sharma");
	}
	
    @Value("${employee.name}")
    private String employeeName;
    
    @GetMapping("/returnname")
    public List<String> employeeList(){
    	nameOfEmployees.add(employeeName);
        return nameOfEmployees;
    }
}
