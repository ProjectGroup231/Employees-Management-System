package com.project.employee.controller;

<<<<<<< HEAD
import java.util.UUID;
=======
import java.util.List;
>>>>>>> e3e78675c39f381089eb0f13b766e00d711a8d6a

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
<<<<<<< HEAD
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/emp", method = RequestMethod.POST)	
=======
	private EmployeeService empService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
>>>>>>> e3e78675c39f381089eb0f13b766e00d711a8d6a
	public String addEmployee(@RequestBody EmployeeModel empModel) {
		String response = employeeService.addEmployee(empModel);
		return response;
	}
<<<<<<< HEAD
  
   @RequestMapping(value = "/emp/{id}",method = RequestMethod.DELETE)
   public Employee deleteEmployee(@PathVariable UUID id) {
	   Employee employee = employeeService.deleteEmployee(id);
	   return  employee;
   }
  

=======
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public List<EmployeeModel> findAllEmployee(){
		List<EmployeeModel> response = empService.findAllEmployee();
		return response;
	}
>>>>>>> e3e78675c39f381089eb0f13b766e00d711a8d6a
}
