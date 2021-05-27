package com.company.patterns.creational.prototype;

public interface Copyable {
    Object copy();
}

class Example implements Copyable {
    String name;
    int integer;

    public Example(String name, int integer) {
        this.name = name;
        this.integer = integer;
    }

    @Override
    public Object copy() {
        Example example = new Example("name", 1);
        return example;
    }
}
