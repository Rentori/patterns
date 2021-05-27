package com.company.patterns.structural.bridge;

public class SmartphoneMaster implements Masters{
    @Override
    public void repare() {
        System.out.println("Smartphone master reparing...");
    }
}
