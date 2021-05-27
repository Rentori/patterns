package com.company.patterns.creational.builder.employeeBuilder;

import com.company.patterns.creational.builder.Speciality;

public class DesktopProgrammerBuilder extends EmployeeBuilder {
    @Override
    void buildName() {
        employee.setName("Ivan");
    }

    @Override
    void buildAge() {
        employee.setAge(31);
    }

    @Override
    void buildSpeciality() {
        employee.setSpeciality(Speciality.PROGRAMMER);
    }
}
