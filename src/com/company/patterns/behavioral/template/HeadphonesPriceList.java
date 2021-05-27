package com.company.patterns.behavioral.template;

public class HeadphonesPriceList extends PriceListTemplate {
    @Override
    public void getAdditionalPriceList() {
        System.out.println("Headphones: 200$");
    }
}
