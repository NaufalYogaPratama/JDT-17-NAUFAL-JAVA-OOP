package com.indivaragroup.exam;

import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.Scanner;

public class Course<T extends Number> {
    private String namaPeserta;
    private T nilai;

    public Course(String namaPeserta, T nilai) {
        this.namaPeserta = namaPeserta;
        this.nilai = nilai;
    }

    public String getNamaPeserta() {
        return namaPeserta;
    }

    public T getNilai() {
        return nilai;
    }

    public void tampilkanData () {

        System.out.println("Nama Peserta : " + namaPeserta);
        System.out.println("Nilai        : " + nilai);

        int nilaiInt = nilai.intValue();
        String status;

        if (nilaiInt >= 85) {
            status = "Excellent";
        } else if (nilaiInt  >= 75) {
            status = "Good";
        } else if (nilaiInt >= 50) {
            status = "Remedial";
        } else {
            status = "Failed";
        }

        System.out.println("Status       : " + status);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Course<Integer>> daftarPeserta = new ArrayList<>();

        System.out.println("Masukkan jumlah peserta : ");
        int jumlahPeserta = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= jumlahPeserta; i++) {
            System.out.println("\nPeserta " + i);
            System.out.println("Nama    : ");
            String nama = scanner.nextLine();

            System.out.println("Nilai   : ");
            int nilai = scanner.nextInt();

            scanner.nextLine();

            daftarPeserta.add(new Course<Integer>(nama, nilai));

        }

        int totalNilai = 0;
        int jumlahLulus = 0;
        int nilaiTertinggi = 1;
        String namaTertinggi = "";

        System.out.println("\n=========HASIL==========");

        for (Course<Integer> peserta : daftarPeserta) {
            peserta.tampilkanData();

            int nilai = peserta.getNilai();
            totalNilai += nilai;

            if (nilai >= 70) {
                jumlahLulus++;
            }

            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
                namaTertinggi = peserta.getNamaPeserta();
            }
        }

        double rataRata = totalNilai / jumlahPeserta;

        System.out.println("========== STATISTIK ==========");
        System.out.println("Rata-rata Nilai         : " + rataRata);
        System.out.println("Jumlah Peserta Lulus    : " + jumlahLulus + " orang");
        System.out.println("Peserta Nilai Tertinggi : " + namaTertinggi + " (Nilai: " + nilaiTertinggi + ")");
    }


}
