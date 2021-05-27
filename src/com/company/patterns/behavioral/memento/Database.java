package com.company.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private Save save;
    private List<User> users = new ArrayList<>();

    public void addToDatabase(User user) {
        users.add(user);
    }

    public void clearDatabase() {
        this.users.clear();
        System.out.println("Database was cleared");
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void makeBackup() {
        save = new Save(new ArrayList<>(users));
        System.out.println("Backup was created");
    }

    public void loadBackup() {
        this.users.addAll(save.getUsers());
        System.out.println("Database reload frow backup");
    }
}
