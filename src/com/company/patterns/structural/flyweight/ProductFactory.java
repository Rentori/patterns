package com.company.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private static final Map<String, Products> productsMap = new HashMap<>();

    public Products getProductByName(String name) {
        Products products = productsMap.get(name);

        if (products == null) {
            switch (name) {
                case "tomatos" -> products = new Tomatos();
                case "bananas" -> products = new Bananas();
            }
            productsMap.put(name, products);
        }
        return products;
    }
}
