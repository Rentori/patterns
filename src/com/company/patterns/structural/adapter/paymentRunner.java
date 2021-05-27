package com.company.patterns.structural.adapter;

public class paymentRunner {
    public static void main(String[] args) {
        CreditCard payment = new VisaCard();
        payment.pay();

        payment = new PayPalAdapter();
        payment.pay();
    }
}
