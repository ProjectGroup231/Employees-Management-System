package com.project.employee.Service;
import java.util.UUID;

import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;

import antlr.collections.List;

public interface EmployeeService {
	
	String addEmployee(EmployeeModel employeeModel);
	Employee deleteEmployee(UUID id);

}




	
	
