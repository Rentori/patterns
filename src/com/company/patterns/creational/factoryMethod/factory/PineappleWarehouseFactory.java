package com.company.patterns.creational.factoryMethod.factory;

import com.company.patterns.creational.factoryMethod.warehouse.PineappleWarehouse;
import com.company.patterns.creational.factoryMethod.warehouse.Warehouse;

public class PineappleWarehouseFactory implements WarehouseFactory {
    @Override
    public Warehouse createWarehouse() {
        return new PineappleWarehouse();
    }
}
