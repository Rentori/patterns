package com.company.patterns.behavioral.command.commands;

import com.company.patterns.behavioral.command.Service;
import com.company.patterns.behavioral.command.commands.Command;

public class LaptopCommand implements Command {
    Service service;

    public LaptopCommand(Service service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.laptopRepare();
    }
}
