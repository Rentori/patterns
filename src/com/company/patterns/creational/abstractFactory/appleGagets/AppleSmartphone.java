package com.company.patterns.creational.abstractFactory.appleGagets;

import com.company.patterns.creational.abstractFactory.Smartphone;

public class AppleSmartphone implements Smartphone {
    @Override
    public void getSmartphoneName() {
        System.out.println("Iphone 11 pro max double XL");
    }
}
