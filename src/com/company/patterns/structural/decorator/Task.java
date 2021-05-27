package com.company.patterns.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Masters master = new ServiceOwner(new ProLaptopMaster(new LaptopMaster()));
        System.out.println(master.repare());
    }
}
