package com.company.patterns.behavioral.chain;

public class MedicalDepo extends DepoController {
    public MedicalDepo(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Medical depo left " + message);
    }
}
