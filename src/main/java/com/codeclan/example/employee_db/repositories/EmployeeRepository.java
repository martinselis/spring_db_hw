package com.codeclan.example.employee_db.repositories;

import com.codeclan.example.employee_db.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
