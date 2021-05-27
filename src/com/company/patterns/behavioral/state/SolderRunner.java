package com.company.patterns.behavioral.state;

public class SolderRunner {
    public static void main(String[] args) {
        Activity activity = new Sleep();
        Solder solder = new Solder();
        solder.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            solder.action();
            solder.changeActivity();
        }
    }
}
