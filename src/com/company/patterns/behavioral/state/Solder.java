package com.company.patterns.behavioral.state;

public class Solder implements Activity{
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleep) {
            activity = new Run();
        }
        else if (activity instanceof Run) {
            activity = new Eat();
        }
        else if (activity instanceof Eat){
            activity = new Dig();
        }
        else if (activity instanceof Dig) {
            activity = new Sleep();
        }
    }

    @Override
    public void action() {
        activity.action();
    }
}
