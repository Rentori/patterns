package com.company.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class WebsiteImpl implements Website{
    private Map<User, String> usersReports = new HashMap<>();

    @Override
    public void addReport(User user, String report) {
        usersReports.put(user, report);
    }

    @Override
    public Map<User, String> getReports() {
        return usersReports;
    }
}
