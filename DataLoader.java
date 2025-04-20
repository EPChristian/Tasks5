package com.dmdev.oop.part3;

public class DataLoader {

    static int loadedCount = 0;
    String name;
    int date;
    String size;

    public DataLoader() {
        loadedCount++;
    }

    public DataLoader(String name) {
        this.name = name;
    }

    public DataLoader(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public DataLoader(String name, String size) {
        this.name = name;
        this.size = size;
    }

    void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Дата: " + date);
        System.out.println("Размер: " + size);
    }

    static int getTotalLoaded(){
        return loadedCount;
    }
}
