package com.company.patterns.behavioral.memento;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        database.addToDatabase(new User("Nikolay", 18));
        database.addToDatabase(new User("Petr", 24));
        database.addToDatabase(new User("Nikita", 118));

        database.makeBackup();
        database.getUsers().forEach(n -> System.out.println(n.toString()));
        database.clearDatabase();
        database.getUsers().forEach(n -> System.out.println(n.toString()));

        database.loadBackup();
        database.getUsers().forEach(n -> System.out.println(n.toString()));
    }
}
