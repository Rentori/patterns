package com.company.patterns.creational.abstractFactory.appleGagets;

import com.company.patterns.creational.abstractFactory.Notebook;

public class AppleNotebook implements Notebook {
    @Override
    public void getNotebookName() {
        System.out.println("Macbook pro 13");
    }
}
