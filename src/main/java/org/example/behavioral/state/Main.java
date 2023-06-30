package org.example.behavioral.state;

public class Main {
    public static void main(String[] args) {
        SniperRifle sniperRifle = new SniperRifle();
        sniperRifle.setActivity(new Reload());

        for (int i = 0; i < 5; i++) {
            sniperRifle.executeActivity();
            sniperRifle.changeActivity();
        }
    }
}
