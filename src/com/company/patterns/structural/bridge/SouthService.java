package com.company.patterns.structural.bridge;

public class SouthService extends Service {
    protected SouthService(Masters master) {
        super(master);
    }

    @Override
    public void startRepare() {
        System.out.println("South service start working...");
        master.repare();
    }
}
