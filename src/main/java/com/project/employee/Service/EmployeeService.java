package com.project.employee.Service;
<<<<<<< HEAD
import java.util.UUID;

import com.project.employee.entities.Employee;
=======

import java.util.List;

>>>>>>> e3e78675c39f381089eb0f13b766e00d711a8d6a
import com.project.employee.model.EmployeeModel;

import antlr.collections.List;

public interface EmployeeService {

	String addEmployee(EmployeeModel employeeModel);
<<<<<<< HEAD
	Employee deleteEmployee(UUID id);

=======
	List<EmployeeModel> findAllEmployee();
	
>>>>>>> e3e78675c39f381089eb0f13b766e00d711a8d6a
}
