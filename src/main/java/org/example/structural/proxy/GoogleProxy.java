package org.example.structural.proxy;

public class GoogleProxy implements Site {
    Site site = new Google();

    @Override
    public void openPage() {
        System.out.println("Proxy");
        site.openPage();
    }
}
