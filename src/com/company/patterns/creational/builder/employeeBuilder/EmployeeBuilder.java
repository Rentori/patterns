package com.company.patterns.creational.builder.employeeBuilder;

import com.company.patterns.creational.builder.Employee;

public abstract class EmployeeBuilder {
    Employee employee;

    void createEmployee() {
        employee = new Employee();
    }

    abstract void buildName();

    abstract void buildAge();

    abstract void buildSpeciality();

    Employee getEmployees() {
        return employee;
    }
}
