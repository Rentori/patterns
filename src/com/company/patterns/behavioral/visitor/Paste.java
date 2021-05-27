package com.company.patterns.behavioral.visitor;

public class Paste implements Dish {
    @Override
    public void cookingBy(Cook cook) {
        cook.cooking(this);
    }
}
