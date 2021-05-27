package com.company.patterns.behavioral.memento;

import java.util.List;

public class Save {
    private final List<User> users;

    public Save(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}
