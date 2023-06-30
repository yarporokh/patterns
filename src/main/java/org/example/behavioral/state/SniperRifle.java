package org.example.behavioral.state;

public class SniperRifle {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Reload) {
            setActivity(new Shoot());
        } else if (activity instanceof Shoot) {
            setActivity(new Reload());
        }
    }

    public void executeActivity() {
        activity.execution();
    }
}
