package com.company.patterns.structural.bridge;

public class NorthService extends Service {
    protected NorthService(Masters master) {
        super(master);
    }

    @Override
    public void startRepare() {
        System.out.println("North service start working...");
        master.repare();
    }
}
