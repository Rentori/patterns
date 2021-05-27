package com.company.patterns.creational.prototype;

public class FileData implements Copyable {
    private String pathName;
    private String data;
    private long size;

    public FileData(String pathName, String data, long size) {
        this.pathName = pathName;
        this.data = data;
        this.size = size;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public Object copy() {
        FileData fileData = new FileData(pathName, data, size);
        return fileData;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "pathName='" + pathName + '\'' +
                ", data='" + data + '\'' +
                ", size=" + size +
                '}';
    }
}
