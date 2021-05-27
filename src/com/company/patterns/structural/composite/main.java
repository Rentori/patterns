package com.company.patterns.structural.composite;

public class main {
    public static void main(String[] args) {
        Transport jet = new Jet();
        Transport rocket = new Rocket();
        Transport ship = new Ship();
        TransportComposite transportTeam = new TransportComposite();

        transportTeam.addTransport(jet);
        transportTeam.addTransport(rocket);
        transportTeam.addTransport(ship);
        transportTeam.move();
    }
}
