package com.company.patterns.creational.abstractFactory.huaweiGagets;

import com.company.patterns.creational.abstractFactory.Tablet;

public class HuaweiTablet implements Tablet {
    @Override
    public void getTabletName() {
        System.out.println("MatePad");
    }
}
