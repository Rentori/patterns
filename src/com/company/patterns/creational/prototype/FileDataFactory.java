package com.company.patterns.creational.prototype;

public class FileDataFactory {
    FileData fileData;

    public FileDataFactory(FileData fileData) {
        this.fileData = fileData;
    }

    FileData copyFileData() {
        return (FileData) fileData;
    }
}
