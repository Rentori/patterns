package com.company.patterns.creational.abstractFactory.huaweiGagets;

import com.company.patterns.creational.abstractFactory.GagetsFactory;
import com.company.patterns.creational.abstractFactory.Notebook;
import com.company.patterns.creational.abstractFactory.Smartphone;
import com.company.patterns.creational.abstractFactory.Tablet;

public class HuaweiGagets implements GagetsFactory {
    @Override
    public Notebook getNotebook() {
        return new HuaweiNotebook();
    }

    @Override
    public Smartphone getSmartphone() {
        return new HuaweiSmartphone();
    }

    @Override
    public Tablet getTablet() {
        return new HuaweiTablet();
    }
}
