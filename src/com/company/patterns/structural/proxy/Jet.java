package com.company.patterns.structural.proxy;

public class Jet implements JetInterface{

    public Jet() {
        fillFuel();
    }
    private void fillFuel() {
        System.out.println("Jet just filled fuel for fly...");
    }
    @Override
    public void startFly() {
        System.out.println("Jet flying!");
    }
}
