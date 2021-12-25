package com.project.employee.serviceImpl;

<<<<<<< HEAD
import java.util.UUID;
=======
import java.util.List;
>>>>>>> e3e78675c39f381089eb0f13b766e00d711a8d6a

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employee.Service.EmployeeService;
import com.project.employee.domain.EmployeeDomain;
import com.project.employee.entities.Employee;
import com.project.employee.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired	
	private EmployeeDomain empDomain;

	@Override
	public String addEmployee(EmployeeModel employeemodel) {
		String result = empDomain.addEmployee(employeemodel);
		return result;

	}
	@Override
	public List<EmployeeModel> findAllEmployee(){
		List<EmployeeModel> empList=empDomain.findAllEmployee();
		return empList;
	}

	@Override
	public Employee deleteEmployee(UUID id) {
		 Employee employee1 = empDomain.deleteEmployee(id);
		return  employee1;
	}

	

}
