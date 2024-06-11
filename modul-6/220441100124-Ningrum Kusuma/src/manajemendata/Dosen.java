/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemendata; // Paket

/**
 *
 * @author ningrum
 */
// Deklarasi Kelas Abstrak adalah kelas yang belum diketahui kelasnya
public abstract class Dosen implements IDosen {
    // Atribut
    String nama;
    String nik;
    int umur;
    char jenisKelamin;
    
    // Konstruktor untuk mengatur nilai awal dari atribut-atribut objek
    public Dosen(String nama, String nik, int umur, char jenisKelamin) {
        this.nama = nama;
        this.nik = nik;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }
    
    // Setter dan Getter untuk Nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    // Setter dan Getter untuk NIK
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNik() {
        return nik;
    } 
    
    // Setter dan Getter untuk Umur
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public int getUmur() {
        return umur;
    }
    
    // Setter dan Getter untuk Jenis Kelamin
    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public char getJenisKelamin() {
        return jenisKelamin;
    }
    
    // Metode Abstrak
    public abstract void tampilkanInfo();
}
