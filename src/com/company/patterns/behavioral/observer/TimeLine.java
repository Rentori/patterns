package com.company.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class TimeLine implements Observed {
    List<String> news = new ArrayList<>();
    List<Observer> visitors = new ArrayList<>();

    public void addNews(String news) {
        this.news.add(news);
        notifyObservers();
    }

    public void removeNews(String news) {
        this.news.remove(news);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.visitors.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.visitors.remove(observer);
    }

    @Override
    public void notifyObservers() {
         for (Observer observer: visitors) {
             observer.handleEvent(this.news);
         }
    }
}
