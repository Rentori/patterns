package com.company.patterns.behavioral.chain;

public class DepoRunner {
    public static void main(String[] args) {
        DepoController fireDepo = new FireDepo(Priority.FIRE);
        DepoController medicalDepo = new MedicalDepo(Priority.EXPLOSION);
        DepoController policeDepo = new PoliceDepo(Priority.ATTACK);

        fireDepo.setNextDepo(medicalDepo);
        medicalDepo.setNextDepo(policeDepo);

        fireDepo.getMessage("(Fire on 11'street)", Priority.FIRE);
        fireDepo.getMessage("(Fire with explosions)", Priority.EXPLOSION);
        fireDepo.getMessage("(Terrorists attack)", Priority.ATTACK);
    }
}
