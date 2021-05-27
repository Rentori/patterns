package com.company.patterns.structural.composite;

public class Ship implements Transport {
    @Override
    public void move() {
        System.out.println("the ship sailing!");
    }
}
