package com.indivaragroup.generic.wildcard;

import java.util.List;

public class ContohWildcard {

    static void cetakSemua(List<?> daftar) {
        for (Object item : daftar) {
            System.out.println(item);
        }
    }

    static void cetakKotak(Kotak<?> kotak) {
        System.out.println("Isi Kotak: " + kotak);
    }

    public static void main(String[] args) {
        List<String> namaDaftar = List.of("Budi", "Arie", "Ani");
        cetakSemua(namaDaftar);

        List<Integer> angkaDaftar = List.of(1, 5, 25, 23);
        cetakSemua(angkaDaftar);
    }

}
