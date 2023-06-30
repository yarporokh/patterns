package org.example.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        SniperRifle sniperRifle = new SniperRifle();

        sniperRifle.setActivity(new Reload());
        sniperRifle.executeActivity();

        sniperRifle.setActivity(new Shoot());
        sniperRifle.executeActivity();

        sniperRifle.setActivity(new Reload());
        sniperRifle.executeActivity();

        sniperRifle.setActivity(new Shoot());
        sniperRifle.executeActivity();
    }
}
