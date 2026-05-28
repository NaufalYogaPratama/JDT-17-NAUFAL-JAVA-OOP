package com.indivaragroup.generic.erasure;

import java.util.ArrayList;
import java.util.List;

public class ProblemErasure {
    public static void main(String[] args) {

        // Menggunakan raw tipe (tanpa generic) - BERBAHAYA!
        List daftarRaw = new ArrayList();
        daftarRaw.add("Halo");
        daftarRaw.add(123);         //--> bisa tambah tipe apapun!

        // Compile Ok, tapi runtime ERROR!
        String teks = (String) daftarRaw.get(1);

        // CARA YANG BENAR: gunakan generic
        List<String> daftarAman = new ArrayList<>();
        daftarAman.add("Halo");
//        daftarAman.add(123);      --> COMPILE ERROR - langsung ketahuan!

        String teksAman = daftarAman.get(0);        //-> aman tidak perlu casting
        System.out.println(teksAman);
    }
}