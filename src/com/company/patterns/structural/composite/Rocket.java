package com.company.patterns.structural.composite;

public class Rocket implements Transport {
    @Override
    public void move() {
        System.out.println("rocket go to the stars!");
    }
}
