package com.indivaragroup.generic;

public class Pasangan<T> {

    private T pertama;
    private T kedua;

    public Pasangan(T pertama, T kedua) {

        this.pertama = pertama;
        this.kedua = kedua;

    }

    @Override
    public String toString() {
        return "Pasangan {" + "pertama= " + ", kedua = " + kedua +"}";
    }

}
