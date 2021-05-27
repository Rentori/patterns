package com.company.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        List<Products> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(productFactory.getProductByName("tomatos"));
            list.add(productFactory.getProductByName("bananas"));
        }
        list.forEach(n -> n.buyProduct());
    }
}
