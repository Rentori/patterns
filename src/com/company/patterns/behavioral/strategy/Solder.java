package com.company.patterns.behavioral.strategy;

public class Solder implements Activity {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void action() {
        activity.action();
    }
}
