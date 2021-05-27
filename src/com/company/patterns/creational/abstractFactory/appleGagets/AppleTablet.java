package com.company.patterns.creational.abstractFactory.appleGagets;

import com.company.patterns.creational.abstractFactory.Tablet;

public class AppleTablet implements Tablet {
    @Override
    public void getTabletName() {
        System.out.println("Ipad pro");
    }
}
