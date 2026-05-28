package com.indivaragroup.generic.bounded.bentuk;

import com.indivaragroup.generic.bounded.MultipleBounded;

class Lingkaran extends MultipleBounded {
    private double radius;
    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }
}
