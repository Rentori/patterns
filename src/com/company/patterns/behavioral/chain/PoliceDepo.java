package com.company.patterns.behavioral.chain;

public class PoliceDepo extends DepoController {
    public PoliceDepo(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Police depo left " + message);
    }
}
