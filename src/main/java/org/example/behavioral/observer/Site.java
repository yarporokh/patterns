package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Site {
    List<String> news = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    public Site() {

        observers.add(new Subscriber("John"));
        observers.add(new Subscriber("Annie"));
        observers.add(new Subscriber("Henry"));
        observers.add(new Subscriber("Cassidy"));
    }

    public void addNews(String post) {
        news.add(post);
        notifySubscribers();
    }

    public void notifySubscribers() {
        for (Observer observer: observers) {
            observer.handleEvent(news);
        }
    }
}
