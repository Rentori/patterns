package com.company.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        JetInterface jet = new JetProxy();
        jet.startFly();
    }
}
