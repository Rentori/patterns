package com.company.patterns.behavioral.command.commands;

import com.company.patterns.behavioral.command.Service;

public class HeadphonesCommand implements Command {
    Service service;

    public HeadphonesCommand(Service service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.headphonesRepare();
    }
}
