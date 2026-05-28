package com.indivaragroup.generic.comparable.interfacing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ContohComparable {
    public static void main(String[] args) {
        List<Mahasiswa> daftar = new ArrayList<>();
        daftar.add(new Mahasiswa("Budi", 3.5));
        daftar.add(new Mahasiswa("Ani", 3.8));
        daftar.add(new Mahasiswa("Cici", 3.2));
        daftar.add(new Mahasiswa("Dodi", 3.9));

        System.out.println("Sebelum diurutkan: ");
        for (Mahasiswa m : daftar) {
            System.out.println(" " + m);
        }

        Collections.sort(daftar);

        System.out.println("\nSetelah diurutkan (berdasarkan IPK): ");
        for (Mahasiswa m : daftar) {
            System.out.println(" " + m);
        }
    }
}
