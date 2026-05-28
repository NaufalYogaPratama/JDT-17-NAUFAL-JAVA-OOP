package com.indivaragroup.generic.challenge;

public class DataProcessor {

    public <T>  void processedData(T[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array kosong atau null");
            return;
        }

    T sample = array[0];

    if (sample instanceof String) {
        System.out.println("====TIPE SATA STRING====");
        for (T item : array) {
            System.out.println(item);
        }
    } else if (sample instanceof Number) {
        System.out.println("====TIPE DATA NUMBER====");
        double sum = 0;
        for (T item : array) {
            sum += ((Number) item).doubleValue();
        }
        System.out.println("Hasil kalkulasi: " + sum);
    } else if (sample instanceof Boolean) {
        System.out.println("TIPE DATA BOOLEAN");
        for (T item : array) {
            boolean boolValue = (Boolean) item;
            System.out.println("Original= " + boolValue + " | Negasi= " + !boolValue );
        }
    } else {
        System.out.println("Tipe data tidak didukung");
    }
    }
}
