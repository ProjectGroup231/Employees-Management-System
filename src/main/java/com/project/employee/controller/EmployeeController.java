package com.project.employee.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.employee.Service.EmployeeService;
import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;
import com.project.employee.repositories.EmployeeRepositories;

import antlr.collections.List;


@RestController
@RequestMapping("/employee")

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/emp", method = RequestMethod.POST)	
	public String addEmployee(@RequestBody EmployeeModel empModel) {
		String response = employeeService.addEmployee(empModel);
		return response;
	}
  
   @RequestMapping(value = "/emp/{id}",method = RequestMethod.DELETE)
   public Employee deleteEmployee(@PathVariable UUID id) {
	   Employee employee = employeeService.deleteEmployee(id);
	   return  employee;
   }
  

}
