package com.company.patterns.creational.builder;

import com.company.patterns.creational.builder.employeeBuilder.*;

import java.util.ArrayList;

public class EmployeesRunner {
    public static void main(String[] args) {
        ArrayList<EmployeeBuilder> employees = new ArrayList<>();
        employees.add(new DesktopHRBuilder());
        employees.add(new DesktopProgrammerBuilder());
        employees.add(new DesktopManagerBuilder());

        Director director = new Director();
        for (EmployeeBuilder eb : employees) {
            Employee employee = director.setAndBuildEmployee(eb);
            System.out.println(employee.toString());
        }
    }
}
