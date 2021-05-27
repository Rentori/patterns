package com.company.patterns.structural.facade;

public class CargoTransportationFacade {
    private int limit;

    public CargoTransportationFacade(int limit) {
        this.limit = limit;
    }

    public void solve() {
        CargoTransportation cargoTransportation = new CargoTransportation(limit);
        for (int i = 0; i < limit; i++) {
            cargoTransportation.addTransport(new Transport());
        }
        cargoTransportation.startTransportation();
    }
}
