package com.company.patterns.structural.bridge;

public class LaptopMater implements Masters{
    @Override
    public void repare() {
        System.out.println("Laptop master reparing...");
    }
}
