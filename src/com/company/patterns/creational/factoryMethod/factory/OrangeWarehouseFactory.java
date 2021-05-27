package com.company.patterns.creational.factoryMethod.factory;

import com.company.patterns.creational.factoryMethod.warehouse.OrangeWarehouse;
import com.company.patterns.creational.factoryMethod.warehouse.Warehouse;

public class OrangeWarehouseFactory implements WarehouseFactory {
    @Override
    public Warehouse createWarehouse() {
        return new OrangeWarehouse();
    }
}
