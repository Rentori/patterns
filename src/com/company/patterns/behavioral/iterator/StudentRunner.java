package com.company.patterns.behavioral.iterator;

public class StudentRunner {
    public static void main(String[] args) {
        String[] languages = {"English ", "Spain ", "Russian ", "Italian "};
        Student student = new Student("Viktor", languages);

        Iterator studentIterator = student.getIterator();

        System.out.println(student.getName());
        while (studentIterator.hasNext()) {
            System.out.print(studentIterator.next().toString());
        }
    }
}
