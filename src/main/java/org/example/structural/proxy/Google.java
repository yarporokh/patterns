package org.example.structural.proxy;

public class Google implements Site {
    @Override
    public void openPage() {
        System.out.println("Open google.com");
    }
}
