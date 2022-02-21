package com.lab.codeclan.example.employeeService;

import com.lab.codeclan.example.employeeService.models.Employee;
import com.lab.codeclan.example.employeeService.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee1 = new Employee("John Smith", 25, "SL209R", "jsmith@employer.com");
		employeeRepository.save(employee1);
	}

}
