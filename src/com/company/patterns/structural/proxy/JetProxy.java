package com.company.patterns.structural.proxy;

public class JetProxy implements JetInterface{
    JetInterface jet;

    @Override
    public void startFly() {
        if (jet == null) {
            jet = new Jet();
        }
        jet.startFly();
    }
}
