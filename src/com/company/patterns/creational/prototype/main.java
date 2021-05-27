package com.company.patterns.creational.prototype;

public class main {
    public static void main(String[] args) {
        FileData fileData = new FileData("path", "data", 111);
        System.out.println(fileData);

        FileDataFactory factory = new FileDataFactory(fileData);
        FileData fileDataCopy = factory.copyFileData();
        fileDataCopy.setData("new data");
        System.out.println(fileDataCopy);
    }
}
