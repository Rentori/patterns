package com.company.patterns.behavioral.strategy;

public class SolderRunner {
    public static void main(String[] args) {
        Solder solder = new Solder();

        solder.setActivity(new Sleep());
        solder.action();

        solder.setActivity(new Eat());
        solder.action();

        solder.setActivity(new Run());
        solder.action();

        solder.setActivity(new Dig());
        solder.action();

        solder.setActivity(new Sleep());
        solder.action();
    }
}
