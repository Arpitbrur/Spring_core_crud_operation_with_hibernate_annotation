package Spring_core_crud_operation_with_hibernate_annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Spring_core_crud_operation_with_hibernate_annotation.dao.EmployeeDao;
import Spring_core_crud_operation_with_hibernate_annotation.dto.Employee;

@Component(value= "empService")
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	// insert method-----------------------------------------------------------------------
	public void insertEmployee(Employee employee ) {
		dao.insertEmployee(employee);
	}	
	
	// getById------------------------------------------------------------------------------
	public Employee getById(int empId) {
		return dao.getById(empId);
	}	
}
