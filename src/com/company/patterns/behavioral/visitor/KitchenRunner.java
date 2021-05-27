package com.company.patterns.behavioral.visitor;

public class KitchenRunner {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Cook juniorCook = new JuniorChief();
        Cook seniorCook = new SeniorChief();

        System.out.println("Junior chief start cooking: ");
        kitchen.cookingBy(juniorCook);
        System.out.println();

        System.out.println("Senior chief start cooking: ");
        kitchen.cookingBy(seniorCook);
    }
}
