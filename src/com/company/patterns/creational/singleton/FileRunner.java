package com.company.patterns.creational.singleton;

public class FileRunner {
    public static void main(String[] args) {
        FileOperations.getFileOperations().writeToFile("first");
        FileOperations.getFileOperations().writeToFile("second");
        FileOperations.getFileOperations().writeToFile("third");
        FileOperations.getFileOperations().readFromFile();
    }
}
