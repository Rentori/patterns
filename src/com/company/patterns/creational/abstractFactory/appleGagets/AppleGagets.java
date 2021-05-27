package com.company.patterns.creational.abstractFactory.appleGagets;

import com.company.patterns.creational.abstractFactory.GagetsFactory;
import com.company.patterns.creational.abstractFactory.Notebook;
import com.company.patterns.creational.abstractFactory.Smartphone;
import com.company.patterns.creational.abstractFactory.Tablet;

public class AppleGagets implements GagetsFactory {
    @Override
    public Notebook getNotebook() {
        return new AppleNotebook();
    }

    @Override
    public Smartphone getSmartphone() {
        return new AppleSmartphone();
    }

    @Override
    public Tablet getTablet() {
        return new AppleTablet();
    }
}
