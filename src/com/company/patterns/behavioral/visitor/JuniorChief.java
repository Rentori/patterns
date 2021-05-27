package com.company.patterns.behavioral.visitor;

public class JuniorChief implements Cook {
    @Override
    public void cooking(Cake cake) {
        System.out.println("Junior chief cooking cake");
    }

    @Override
    public void cooking(Pie pie) {
        System.out.println("Junior chief cooking pie");
    }

    @Override
    public void cooking(Paste paste) {
        System.out.println("Junior chief cooking paste");
    }
}
