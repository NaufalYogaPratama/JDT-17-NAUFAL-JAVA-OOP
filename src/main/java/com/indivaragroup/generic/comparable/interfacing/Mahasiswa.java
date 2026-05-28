package com.indivaragroup.generic.comparable.interfacing;

public class Mahasiswa implements Comparable<Mahasiswa> {
    private String nama;
    private double ipk;

    public Mahasiswa(String nama, double ipk) {
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public double getIpk() {
        return ipk;
    }

    @Override
    public int compareTo(Mahasiswa lain) {
        return Double.compare(this.ipk, lain.ipk);
    }

    @Override
    public String toString() {
        return nama + " (IPK: " + ipk + ")";
    }
}
