package com.company.patterns.creational.abstractFactory.huaweiGagets;

import com.company.patterns.creational.abstractFactory.Notebook;

public class HuaweiNotebook implements Notebook {
    @Override
    public void getNotebookName() {
        System.out.println("Matebook 14");
    }
}
