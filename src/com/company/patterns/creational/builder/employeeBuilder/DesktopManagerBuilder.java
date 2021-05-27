package com.company.patterns.creational.builder.employeeBuilder;

import com.company.patterns.creational.builder.Speciality;

public class DesktopManagerBuilder extends EmployeeBuilder {
    @Override
    void buildName() {
        employee.setName("Nikolay");
    }

    @Override
    void buildAge() {
        employee.setAge(27);
    }

    @Override
    void buildSpeciality() {
        employee.setSpeciality(Speciality.MANAGER);
    }
}
