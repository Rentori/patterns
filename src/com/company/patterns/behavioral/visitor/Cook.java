package com.company.patterns.behavioral.visitor;

public interface Cook {
    void cooking(Cake cake);
    void cooking(Pie pie);
    void cooking(Paste paste);
}
