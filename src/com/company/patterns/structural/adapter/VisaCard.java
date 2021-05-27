package com.company.patterns.structural.adapter;

public class VisaCard implements CreditCard {
    @Override
    public void pay() {
        System.out.println("Pay frow visa");
    }
}
