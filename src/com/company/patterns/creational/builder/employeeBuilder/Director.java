package com.company.patterns.creational.builder.employeeBuilder;

import com.company.patterns.creational.builder.Employee;

public class Director {
    EmployeeBuilder builder;

    public void setBuilder(EmployeeBuilder builder) {
        this.builder = builder;
    }

    public Employee buildEmployee() {
        builder.createEmployee();
        builder.buildName();
        builder.buildAge();
        builder.buildSpeciality();

        Employee employee = builder.getEmployees();
        return employee;
    }

    public Employee setAndBuildEmployee(EmployeeBuilder builder) {
        setBuilder(builder);
        Employee employee = buildEmployee();
        return employee;
    }
}
