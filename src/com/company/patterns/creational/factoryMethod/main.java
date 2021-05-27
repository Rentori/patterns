package com.company.patterns.creational.factoryMethod;

import com.company.patterns.creational.factoryMethod.factory.AppleWarehouseFactory;
import com.company.patterns.creational.factoryMethod.factory.OrangeWarehouseFactory;
import com.company.patterns.creational.factoryMethod.factory.PineappleWarehouseFactory;
import com.company.patterns.creational.factoryMethod.factory.WarehouseFactory;
import com.company.patterns.creational.factoryMethod.warehouse.Warehouse;

public class main {
    public static void main(String[] args) {
        WarehouseFactory warehouseFactory = getWarehouse("apple");
        Warehouse warehouse = warehouseFactory.createWarehouse();
        warehouse.getQuantityOfGoods();
    }

    static WarehouseFactory getWarehouse(String name) {
        if (name.equalsIgnoreCase("apple")) {
            return new AppleWarehouseFactory();
        } else if (name.equalsIgnoreCase("orange")) {
            return new OrangeWarehouseFactory();
        } else if (name.equalsIgnoreCase("pineapple")) {
            return new PineappleWarehouseFactory();
        } else throw new RuntimeException("Warehouse not found");
    }
}
