package com.codeclan.example.employee_db;

import com.codeclan.example.employee_db.models.Employee;
import com.codeclan.example.employee_db.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDbApplicationTests {

	@Autowired
	EmployeeRepository employeeRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee = new Employee("John", 22, 100, "john@john.com");
		employeeRepo.save(employee);
	}

}
