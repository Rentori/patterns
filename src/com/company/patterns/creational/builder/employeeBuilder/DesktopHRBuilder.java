package com.company.patterns.creational.builder.employeeBuilder;

import com.company.patterns.creational.builder.Speciality;

public class DesktopHRBuilder extends EmployeeBuilder {
    @Override
    void buildName() {
        employee.setName("Petr");
    }

    @Override
    void buildAge() {
        employee.setAge(25);
    }

    @Override
    void buildSpeciality() {
        employee.setSpeciality(Speciality.HR);
    }
}
