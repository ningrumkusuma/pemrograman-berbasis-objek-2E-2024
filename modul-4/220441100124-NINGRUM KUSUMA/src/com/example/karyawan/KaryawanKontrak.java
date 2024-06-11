/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.karyawan;

/**
 *
 * @author ningrum
 */
public class KaryawanKontrak extends Karyawan { // Class

    // Private fields (Atribut)
    private double upahPerJam;
    private int jumlahJamKerja;

    // Constructor untuk mengatur nilai awal dari atribut-atribut objek
    public KaryawanKontrak(String nama, int usia, String posisi, double upahPerJam, int jumlahJamKerja) {
        super(nama, usia, posisi); // Memanggil konstruktor dari superclass (Karyawan)
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    // Override method dari superclass (Karyawan)
    @Override
    public void tampilkanData() {
        System.out.println("Karyawan Kontrak");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Posisi: " + posisi);
        System.out.println("Upah Per Jam: " + upahPerJam);
        System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja);
    }
}
