package com.company.patterns.behavioral.state;

public class Sleep implements Activity {
    @Override
    public void action() {
        System.out.println("Solder go to sleep, finally");
    }
}
