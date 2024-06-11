/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemendata; // Paket

/**
 *
 * @author ningrum
 */

// Subclass dari kelas abstrak Dosen
public class DosenTetap extends Dosen {
    // Atribut tambahan spesifik untuk DosenTetap
    double gajiPokok;
    double tunjangan;

    // Konstruktor untuk menginisialisasi DosenTetap
    public DosenTetap(String nama, String nik, int umur, char jenisKelamin, double gajiPokok, double tunjangan) {
        super(nama, nik, umur, jenisKelamin); // Memanggil konstruktor kelas induk (Dosen)
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }
    
    // Getter dan Setter untuk gajiPokok
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter dan Setter untuk tunjangan
    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }    

    // Implementasi metode abstrak hitungGaji dari kelas Dosen
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }
    
    // Implementasi metode abstrak tampilkanInfo dari kelas Dosen
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + hitungGaji());
    }
}
