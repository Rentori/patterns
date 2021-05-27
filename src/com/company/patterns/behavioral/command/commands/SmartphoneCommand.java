package com.company.patterns.behavioral.command.commands;

import com.company.patterns.behavioral.command.Service;

public class SmartphoneCommand implements Command {
    Service service;

    public SmartphoneCommand(Service service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.smartphoneRepare();
    }
}
