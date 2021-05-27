package com.company.patterns.creational.abstractFactory.huaweiGagets;

import com.company.patterns.creational.abstractFactory.Smartphone;

public class HuaweiSmartphone implements Smartphone {
    @Override
    public void getSmartphoneName() {
        System.out.println("P40 pro");
    }
}
