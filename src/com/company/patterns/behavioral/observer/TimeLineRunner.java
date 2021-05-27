package com.company.patterns.behavioral.observer;

public class TimeLineRunner {
    public static void main(String[] args) {
        TimeLine timeLine = new TimeLine();

        timeLine.addNews("First news");
        timeLine.addNews("Important news");

        Observer visitor = new Visitor("Viktor");
        Observer visitor2 = new Visitor("Nikolay");

        timeLine.addObserver(visitor);
        timeLine.addObserver(visitor2);

        timeLine.addNews("Something news");
        timeLine.removeNews("First news");
    }
}
