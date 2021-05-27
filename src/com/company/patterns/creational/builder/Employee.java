package com.company.patterns.creational.builder;

public class Employee {
    private String name;
    private int age;
    private Speciality speciality;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", speciality=" + speciality +
                '}';
    }
}
