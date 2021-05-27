package com.company.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TransportComposite implements Transport {
    List<Transport> transportList = new ArrayList<>();

    public void addTransport(Transport transport) {
        transportList.add(transport);
    }

    @Override
    public void move() {
        transportList.forEach(Transport::move);
    }
}
