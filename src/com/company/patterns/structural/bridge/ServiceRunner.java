package com.company.patterns.structural.bridge;

import java.util.Arrays;

public class ServiceRunner {
    public static void main(String[] args) {
        Service[] services = {
                new NorthService(new SmartphoneMaster()),
                new SouthService(new LaptopMater())
        };

        Arrays.stream(services).forEach(Service::startRepare);
    }
}
