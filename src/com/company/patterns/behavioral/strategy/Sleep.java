package com.company.patterns.behavioral.strategy;

public class Sleep implements Activity {
    @Override
    public void action() {
        System.out.println("Solder go to sleep, finally");
    }
}
