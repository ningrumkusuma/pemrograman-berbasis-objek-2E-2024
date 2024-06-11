/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.databuku;

/**
 *
 * @author ningrum
 */
class perpustakaan { // Class //superclass
    // Instance fields (Atribut digunakan untuk menyimpan data atau informasi tentang objek yang di definisikan oleh kelas)
    String judul;
    String penulis;
    String publisher;
    String kategori;
    int stok;
    int thn_terbit;
    
    // Constructor digunakan untuk menginisialisasi objek
    perpustakaan(String judul, String penulis, String publisher, String kategori, int stok, int thn_terbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.thn_terbit = thn_terbit;
    }
    
    // Instance method
    //void digunakan dalam pemrograman untuk menunjukkan bahwa sebuah fungsi atau metode tidak mengembalikan nilai apapun
    void print() {
        System.out.println("judul :" + this.judul);
        System.out.println("penulis :" + this.penulis);
        System.out.println("publisher :" + this.publisher);
        System.out.println("kategori :" + this.kategori);
        System.out.println("stok :" + this.stok);
        System.out.println("Tahun Terbit :" + this.thn_terbit);
    }
}

// Subclasses (Class turunan)
class Dewasa extends perpustakaan { // Class turunan dari perpustakaan
    // Constructor ini menginisialisasi instance fields(atribut) ketika sebuah objek dibuat.
    Dewasa(String judul, String penulis, String publisher, int stok, int thn_terbit) {
        super(judul, penulis, publisher, "D", stok, thn_terbit);
    }
}

class Remaja extends perpustakaan { // Class turunan dari perpustakaan
    // Constructor ini menginisialisasi instance fields ketika sebuah objek dibuat.
    Remaja(String judul, String penulis, String publisher, int stok, int thn_terbit) {
        super(judul, penulis, publisher, "R", stok, thn_terbit);
    }
}

class Anak extends perpustakaan { // Class turunan dari perpustakaan
    // Constructor ini menginisialisasi instance fields ketika sebuah objek dibuat.
    Anak(String judul, String penulis, String publisher, int stok, int thn_terbit) {
        super(judul, penulis, publisher, "A", stok, thn_terbit);
    }
}

class SemuaUmur extends perpustakaan { // Class turunan dari perpustakaan
    // Constructor ini menginisialisasi instance fields ketika sebuah objek dibuat.
    SemuaUmur(String judul, String penulis, String publisher, int stok, int thn_terbit) {
        super(judul, penulis, publisher, "SU", stok, thn_terbit);
    }
}
