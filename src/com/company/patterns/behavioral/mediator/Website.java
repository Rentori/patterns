package com.company.patterns.behavioral.mediator;

import java.util.Map;

public interface Website {
    Map<User, String> getReports();

    void addReport(User user, String report);
}
