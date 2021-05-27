package com.company.patterns.behavioral.chain;

public class FireDepo extends DepoController {
    public FireDepo(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Fire depo left " + message);
    }
}
