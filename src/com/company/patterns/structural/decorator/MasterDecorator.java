package com.company.patterns.structural.decorator;

public class MasterDecorator implements Masters {
    Masters master;

    public MasterDecorator(Masters master) {
        this.master = master;
    }

    @Override
    public String repare() {
        return master.repare();
    }
}
