package com.company.patterns.creational.factoryMethod.warehouse;

public class AppleWarehouse implements Warehouse {
    @Override
    public void getQuantityOfGoods() {
        System.out.println("quantity of apples: 7000");
    }
}
