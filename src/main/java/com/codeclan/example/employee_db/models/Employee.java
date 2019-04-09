package com.codeclan.example.employee_db.models;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Column
    private String name;

    @Column
    private int age;

    @Column(name="employee_number")
    private int employeeNumber;

    @Column
    private String email;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    public Employee() {

    }

    public Employee(String name, int age, int employeeNumber, String email) {
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
