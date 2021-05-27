package com.company.patterns.creational.abstractFactory;

public interface GagetsFactory {
    Notebook getNotebook();
    Smartphone getSmartphone();
    Tablet getTablet();
}
