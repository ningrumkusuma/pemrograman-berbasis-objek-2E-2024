/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.karyawan;

/**
 *
 * @author ningrum
 */
// Abstract class adalah sebuah kelas dalam pemrograman yang tidak bisa diinstansiasi, tetapi bisa digunakan sebagai kerangka dasar untuk kelas-kelas turunannya.
public abstract class Karyawan { // Class
    // Protected fields (Atribut)digunakan dalam Java untuk mengatur aksesibilitas suatu anggota (atribut atau method) dari suatu kelas
    protected String nama;
    protected int usia;
    protected String posisi;

    // Constructorini digunakan untuk inisialisasi nilai-nilai atribut saat objek dari kelas turunan dibuat.
    public Karyawan(String nama, int usia, String posisi) {
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
    }

    // Abstract method digunakan untuk membuat method tanpa implementasi di dalam kelas abstrak. 
    public abstract void tampilkanData();  
}
