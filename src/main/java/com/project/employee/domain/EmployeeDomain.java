package com.project.employee.domain;

<<<<<<< HEAD
import java.util.UUID;

import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;

public interface EmployeeDomain {
	String addEmployee(EmployeeModel empModel);	
    Employee deleteEmployee(UUID id);
    
=======
import java.util.List;

import com.project.employee.model.EmployeeModel;

public interface EmployeeDomain {

	String addEmployee(EmployeeModel employeeModel);
	List<EmployeeModel> findAllEmployee();
>>>>>>> e3e78675c39f381089eb0f13b766e00d711a8d6a
}
