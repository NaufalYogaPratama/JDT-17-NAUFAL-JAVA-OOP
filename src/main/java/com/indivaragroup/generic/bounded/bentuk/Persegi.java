package com.indivaragroup.generic.bounded.bentuk;

import com.indivaragroup.generic.bounded.MultipleBounded;

public class Persegi extends MultipleBounded {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}
