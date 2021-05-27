package com.company.patterns.creational.singleton;

import java.io.*;

public class FileOperations {
    private static FileOperations fileOperations;
    private static final String pathName = "src/com/company/patterns/singleton/singletone.txt";

    private FileOperations() {
    }

    public static synchronized FileOperations getFileOperations() {
        if (fileOperations == null) {
            fileOperations = new FileOperations();
        }
        return fileOperations;
    }

    public void writeToFile(String string) {
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(pathName, true))) {
            fileWriter.write(string + "\n");
            System.out.println(string + " success writed");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public void readFromFile() {
        System.out.println("\n Start reading: ");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}

