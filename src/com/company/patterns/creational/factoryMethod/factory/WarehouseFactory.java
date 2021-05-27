package com.company.patterns.creational.factoryMethod.factory;

import com.company.patterns.creational.factoryMethod.warehouse.Warehouse;

public interface WarehouseFactory {
    Warehouse createWarehouse();
}
