package com.company.patterns.structural.bridge;

public abstract class Service {
    protected Masters master;

    protected Service(Masters master) {
        this.master = master;
    }

    public abstract void startRepare();
}
