package com.company.patterns.behavioral.visitor;

public class Cake implements Dish {
    @Override
    public void cookingBy(Cook cook) {
        cook.cooking(this);
    }
}
