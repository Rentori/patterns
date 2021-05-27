package com.company.patterns.behavioral.visitor;

public class Kitchen implements Dish {
    Dish[] dishes;

    public Kitchen() {
        this.dishes = new Dish[] {
                new Pie(),
                new Cake(),
                new Paste()
        };
    }

    @Override
    public void cookingBy(Cook cook) {
        for(Dish dish: dishes) {
            dish.cookingBy(cook);
        }
    }
}
