package com.company.patterns.behavioral.visitor;

public class SeniorChief implements Cook {
    @Override
    public void cooking(Cake cake) {
        System.out.println("Senior chief cooking cake");
    }

    @Override
    public void cooking(Pie pie) {
        System.out.println("Senior chief cooking pie");
    }

    @Override
    public void cooking(Paste paste) {
        System.out.println("Senior chief cooking paste");
    }
}
