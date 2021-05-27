package com.company.patterns.behavioral.observer;

import java.util.List;

public class Visitor implements Observer{
    private String name;

    public Visitor(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> news) {
        System.out.println(name + ": " + "news for you today");
        news.forEach(System.out::println);
        System.out.println("\n=========================================================\n");
    }
}
