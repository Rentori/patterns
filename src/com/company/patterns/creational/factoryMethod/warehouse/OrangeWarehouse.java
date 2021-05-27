package com.company.patterns.creational.factoryMethod.warehouse;

public class OrangeWarehouse implements Warehouse {
    @Override
    public void getQuantityOfGoods() {
        System.out.println("quantity of oranges: 9000");
    }
}
