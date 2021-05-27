package com.company.patterns.behavioral.template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class PriceListTemplate {
    List<String> priceList = new ArrayList<>(Arrays.asList("Laptop: 300$", "Smartphone: 500$"));

    public void getPriceList() {
        priceList.forEach(System.out::println);
        getAdditionalPriceList();
    }

    public abstract void getAdditionalPriceList();
}
