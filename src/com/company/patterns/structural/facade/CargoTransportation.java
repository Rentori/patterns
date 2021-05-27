package com.company.patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class CargoTransportation {
    private List<Transport> transportList = new ArrayList<>();
    private int limit;

    public CargoTransportation(int limit) {
        this.limit = limit;
    }

    public void addTransport(Transport transport) {
        transportList.add(transport);
        System.out.println("System add transport");
    }

    public void startTransportation() {
        System.out.println("System start transportation");
        for (int i = 0; i < limit; i++) {
            transportList.get(i).transporting();
        }
        System.out.println("Transporting was end");
    }
}
