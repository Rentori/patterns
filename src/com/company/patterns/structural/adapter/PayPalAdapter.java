package com.company.patterns.structural.adapter;

public class PayPalAdapter extends PayPal implements CreditCard{
    @Override
    public void pay() {
        payFromPayPal();
    }
}
