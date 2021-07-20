package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dao.EmployeeDao;
import com.dao.EmployeeEntity;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao employeeDao;
		
		
		@GetMapping("displayRegForm1")
		String displayForm(){
			
			return "registration";
		}
		@PostMapping("register")
		String registerEmp(@ModelAttribute EmployeeEntity employeeEntity){
			
			System.out.println(employeeEntity);
			
			employeeDao.save(employeeEntity);
			
			
			
			return  "registration";
		}
		
}
