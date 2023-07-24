package Spring_core_crud_operation_with_hibernate_annotation.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component(value = "employee")
public class Employee {

	@Id
	private int empId;
	private String empName;
	private String empEmail;
	
	
}
