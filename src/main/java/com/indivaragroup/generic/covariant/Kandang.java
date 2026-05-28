package com.indivaragroup.generic.covariant;

public class Kandang<T> {

    private T penghuni;

    public Kandang(T penghuni) {
        this.penghuni = penghuni;
    }

    public T getPenghuni() {
        return penghuni;
    }

    public void setPenghuni(T penghuni) {
        this.penghuni = penghuni;
    }
}
