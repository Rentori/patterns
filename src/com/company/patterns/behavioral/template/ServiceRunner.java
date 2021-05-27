package com.company.patterns.behavioral.template;

public class ServiceRunner {
    public static void main(String[] args) {
        PriceListTemplate headphones = new HeadphonesPriceList();
        PriceListTemplate tablet = new TabletPriceList();

        headphones.getPriceList();
        tablet.getPriceList();
    }
}
