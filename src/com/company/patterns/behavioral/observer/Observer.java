package com.company.patterns.behavioral.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> news);
}
