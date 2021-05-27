package com.company.patterns.structural.adapter;

public class MasterCard implements CreditCard {
    @Override
    public void pay() {
        System.out.println("Pay from masterCard");
    }
}
