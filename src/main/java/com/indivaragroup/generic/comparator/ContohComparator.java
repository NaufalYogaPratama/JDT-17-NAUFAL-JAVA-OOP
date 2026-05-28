package com.indivaragroup.generic.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContohComparator {
    public static void main(String[] args) {
        List<Product> daftar = new ArrayList<>();
        daftar.add(new Product("Laptop", 15000000));
        daftar.add(new Product("Mouse", 1500000));
        daftar.add(new Product("Keyboard", 2000000));

        Comparator<Product> urutHarga =(p1, p2) -> Double.compare(p1.harga, p2.harga);
        Collections.sort(daftar, urutHarga);

        System.out.println("Diurutkan berdasarkan Harga: ");
        daftar.forEach(System.out::println);

        daftar.sort(Comparator.comparing(p -> p.nama));
        System.out.println("\nDiurutkan berdasarkan nama: ");
        daftar.forEach(System.out::println);
    }
}
