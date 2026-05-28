package com.indivaragroup.generic.multiplebounded;

import com.indivaragroup.generic.bounded.MultipleBounded;

import java.util.ArrayList;
import java.util.List;

public class KoleksiBentuk<T extends MultipleBounded & Comparable<MultipleBounded>> {
    public List<T> daftarBentuk = new ArrayList<>();

    public void tambah(T bentuk) {
        daftarBentuk.add(bentuk);
    }

    public T terbesar() {
        T max = daftarBentuk.get(0);
        for (T b : daftarBentuk) {
            if (b.compareTo(max) > 0) max = b;
        }
        return max;
    }
}
