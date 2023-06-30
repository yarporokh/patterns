package org.example.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Site site = new GoogleProxy();
        site.openPage();
    }
}
