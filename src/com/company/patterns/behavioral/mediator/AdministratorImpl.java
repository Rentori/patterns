package com.company.patterns.behavioral.mediator;

import java.util.Map;

public class AdministratorImpl implements Administrator{
    Website website;
    String name;

    public AdministratorImpl(Website website, String name) {
        this.website = website;
        this.name = name;
    }

    @Override
    public void getReport() {
        System.out.println("Administrator " + this.name + " watching reports");
        Map<User, String> userReports = website.getReports();
        for (Map.Entry<User, String> entry: userReports.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
    }
}
