package com.company.patterns.structural.decorator;

public class ProLaptopMaster extends MasterDecorator {
    public ProLaptopMaster(Masters master) {
        super(master);
    }

    public String proRepare() {
        return " and cheking workability";
    }

    @Override
    public String repare() {
        return super.repare() + proRepare();
    }
}
