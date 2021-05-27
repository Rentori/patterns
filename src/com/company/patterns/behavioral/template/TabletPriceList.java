package com.company.patterns.behavioral.template;

public class TabletPriceList extends PriceListTemplate {
    @Override
    public void getAdditionalPriceList() {
        System.out.println("Tablet: 400$");
    }
}
