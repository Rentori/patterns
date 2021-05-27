package com.company.patterns.creational.abstractFactory;

import com.company.patterns.creational.abstractFactory.appleGagets.AppleGagets;
import com.company.patterns.creational.abstractFactory.huaweiGagets.HuaweiGagets;

public class main {
    public static void main(String[] args) {
        GagetsFactory gagetsFactory = getGagets("huawei");
        Smartphone smartphone = gagetsFactory.getSmartphone();
        Notebook notebook = gagetsFactory.getNotebook();
        Tablet tablet = gagetsFactory.getTablet();

        smartphone.getSmartphoneName();
        notebook.getNotebookName();
        tablet.getTabletName();
    }

    public static GagetsFactory getGagets(String name) {
        if (name.equalsIgnoreCase("apple")) {
            return new AppleGagets();
        }
        else if (name.equalsIgnoreCase("huawei")) {
            return new HuaweiGagets();
        } else throw new RuntimeException("Gagets not fount");
    }
}
