package com.company.patterns.behavioral.command.commands;

import com.company.patterns.behavioral.command.Service;

public class PCCommand implements Command {
    Service service;

    public PCCommand(Service service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.pcRepare();
    }
}
