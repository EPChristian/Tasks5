package com.dmdev.oop.part3;

public class DataLoaderRunner {

    public static void main(String[] args) {

        DataLoader loader1 = new DataLoader();
        loader1.name = "Документ";
        loader1.date = 2021;
        loader1.size = "большой";

        loader1.printInfo();

        DataLoader loader2 = new DataLoader();
        loader2.name = "Рисунок";
        loader2.date = 2014;
        loader2.size = "средний";

        loader2.printInfo();

        DataLoader loader3 = new DataLoader();
        loader3.name = "Файл";
        loader3.date = 2025;
        loader3.size = "маленький";

        loader3.printInfo();

        System.out.println("Количество загруженных объектов: " + DataLoader.getTotalLoaded());

    }
}
