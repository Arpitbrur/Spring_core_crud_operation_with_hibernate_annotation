package Spring_core_crud_operation_with_hibernate_annotation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import Spring_core_crud_operation_with_hibernate_annotation.dto.Employee;

@Component
public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("arpit");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	// insert method-----------------------------------------------------------------------
	public void insertEmployee(Employee employee ) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
		System.out.println("Data inserted Successfully............");
	}
	
	// getById------------------------------------------------------------------------------
	public Employee getById(int empId) {
		Employee employee = entityManager.find(Employee.class, empId);
		return employee;		
	}
	
	// update method-----------------------------------------------------------------------
}
