package Spring_core_crud_operation_with_hibernate_annotation.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Spring_core_crud_operation_with_hibernate_annotation.MyConfig;
import Spring_core_crud_operation_with_hibernate_annotation.dto.Employee;
import Spring_core_crud_operation_with_hibernate_annotation.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		EmployeeService employeeService = (EmployeeService) applicationContext.getBean("empService");
		
		Employee employee = (Employee) applicationContext.getBean("employee");
		
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("Entrt your choice");
			System.out.println("1. Insert\n2. GetById\n3. Update\n4. Delete\n5. Display\n6. Exit");
			int ch= sc.nextInt();
			switch (ch) {
			case 1:{
				System.out.println("Enter Employee Id");
				employee.setEmpId(sc.nextInt());
				System.out.println("Enter Employee NAme");
				employee.setEmpName(sc.next());
				System.out.println("Enter Employee Email");
				employee.setEmpEmail(sc.next());
				
				employeeService.insertEmployee(employee);
			}break;
			
			case 2:{
				System.out.println("enter emp Id whic you want to fetching");
				
				Employee employee2 = employeeService.getById(sc.nextInt());
				if(employee2 != null) {
					System.out.println("Employee ID:-"+employee2.getEmpId());
					System.out.println("Employee Name:- "+employee2.getEmpName());
					System.out.println("Employee email:-"+employee2.getEmpEmail());
					System.out.println("=======================================");
				}
				}break;
				
	       }
	    }
			
	}	
	
}
