package com.company.patterns.behavioral.mediator;

public class UserImpl implements User {
    Website website;
    private String name;

    public UserImpl(Website website, String name) {
        this.website = website;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void sendReport(String report) {
        System.out.println("User " + this.name + " add new report: " + report);
        website.addReport(this, report);
    }
}
