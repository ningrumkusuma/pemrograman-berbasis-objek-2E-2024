/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.karyawan;

/**
 *
 * @author ningrum
 */
public class KaryawanTetap extends Karyawan { // Class

    // Private field (Atribut)
    private double gajiBulanan;

    // Constructor
    public KaryawanTetap(String nama, int usia, String posisi, double gajiBulanan) {
        super(nama, usia, posisi); // Memanggil konstruktor dari superclass (Karyawan)
        this.gajiBulanan = gajiBulanan; // Menginisialisasi atribut gajiBulanan
    }

    // Override method dari superclass (Karyawan)
    @Override
    public void tampilkanData() {
        System.out.println("Karyawan Tetap");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Posisi: " + posisi);
        System.out.println("Gaji Bulanan: " + gajiBulanan);
    }
}
