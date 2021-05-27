package com.company.patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        CargoTransportationFacade facade = new CargoTransportationFacade(5);
        facade.solve();
    }
}
