package com.project.employee.domain;

import java.util.UUID;

import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;

public interface EmployeeDomain {
	String addEmployee(EmployeeModel empModel);	
    Employee deleteEmployee(UUID id);
    
}
