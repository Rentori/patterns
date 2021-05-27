package com.company.patterns.structural.decorator;

public class ServiceOwner extends MasterDecorator {
    public ServiceOwner(Masters master) {
        super(master);
    }

    public String reciveLaptop() {
        return " and recive laptop";
    }

    @Override
    public String repare() {
        return super.repare() + reciveLaptop();
    }
}
