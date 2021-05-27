package com.company.patterns.behavioral.command;

import com.company.patterns.behavioral.command.Master;
import com.company.patterns.behavioral.command.Service;
import com.company.patterns.behavioral.command.commands.HeadphonesCommand;
import com.company.patterns.behavioral.command.commands.LaptopCommand;
import com.company.patterns.behavioral.command.commands.PCCommand;
import com.company.patterns.behavioral.command.commands.SmartphoneCommand;

public class ServiceRunner {
    public static void main(String[] args) {
        Service service = new Service();
        Master master = new Master(
                new LaptopCommand(service), new SmartphoneCommand(service),
                new HeadphonesCommand(service), new PCCommand(service)
        );

        master.repareHeadphones();
        master.repareLaptop();
        master.reparePC();
        master.repareSmartphone();
    }
}
