package com.company.patterns.behavioral.iterator;

public class Student implements Collection {
    private final String name;
    private final String[] languages;

    public Student(String name, String[] languages) {
        this.name = name;
        this.languages = languages;
    }

    @Override
    public Iterator getIterator() {
        return new LanguagesIterator();
    }

    public String getName() {
        return name;
    }

    private class LanguagesIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < languages.length;
        }

        @Override
        public Object next() {
            return languages[index++];
        }
    }
}
