package com.project.employee.domainImpl;



import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.employee.domain.EmployeeDomain;
import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;
import com.project.employee.repositories.EmployeeRepositories;

import antlr.collections.List;
@Component
public class EmployeeDomainImpl implements EmployeeDomain {
	
	@Autowired
	private EmployeeRepositories empRepo;
	
	public String addEmployee(EmployeeModel employeeModel) {
		Employee emp=new Employee();
		emp.setName(employeeModel.getName());
		emp.setAdd(employeeModel.getAdd());
		emp.setPost(employeeModel.getPost());
		emp.setSalary(employeeModel.getSalary());
		empRepo.save(emp);
		return "employee added successfully";
		
	}

	@Override
	public Employee deleteEmployee(UUID id) {
		 Employee employee = empRepo.findById(id).get();
		empRepo.deleteById(id);
		return employee;
	}

  
	

}
