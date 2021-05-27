package com.company.patterns.creational.factoryMethod.warehouse;

public class PineappleWarehouse implements Warehouse {
    @Override
    public void getQuantityOfGoods() {
        System.out.println("quantity of pineapples: 10000");
    }
}
