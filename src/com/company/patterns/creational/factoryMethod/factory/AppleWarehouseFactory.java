package com.company.patterns.creational.factoryMethod.factory;

import com.company.patterns.creational.factoryMethod.warehouse.AppleWarehouse;
import com.company.patterns.creational.factoryMethod.warehouse.Warehouse;

public class AppleWarehouseFactory implements WarehouseFactory {
    @Override
    public Warehouse createWarehouse() {
        return new AppleWarehouse();
    }
}
