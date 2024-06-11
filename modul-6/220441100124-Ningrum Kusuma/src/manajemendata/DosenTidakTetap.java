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
public class DosenTidakTetap extends Dosen {
    // Atribut tambahan spesifik untuk DosenTidakTetap
    int jamMengajar;
    double honorPerjam;

    // Konstruktor untuk menginisialisasi DosenTidakTetap
    public DosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, int jamMengajar, double honorPerjam) {
        super(nama, nik, umur, jenisKelamin); // Memanggil konstruktor kelas induk (Dosen)
        this.jamMengajar = jamMengajar;
        this.honorPerjam = honorPerjam;
    }
    
    // Getter dan Setter untuk jamMengajar
    public int getJamMengajar() {
        return jamMengajar;
    }

    public void setJamMengajar(int jamMengajar) {
        this.jamMengajar = jamMengajar;
    }

    // Getter dan Setter untuk honorPerjam
    public double getHonorPerjam() {
        return honorPerjam;
    }

    public void setHonorPerjam(double honorPerjam) {
        this.honorPerjam = honorPerjam;
    }

    // Implementasi metode abstrak hitungGaji dari kelas Dosen
    @Override
    public double hitungGaji() {
        return jamMengajar * honorPerjam;
    }
    
    // Implementasi metode abstrak tampilkanInfo dari kelas Dosen
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Jam Mengajar: " + jamMengajar);
        System.out.println("Honor Per Jam: " + honorPerjam);
        System.out.println("Total Gaji: " + hitungGaji());
    }
}
