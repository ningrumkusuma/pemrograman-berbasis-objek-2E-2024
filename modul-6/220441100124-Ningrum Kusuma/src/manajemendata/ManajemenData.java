/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manajemendata; // Paket

import java.util.Scanner; // Import library untuk membaca input dari pengguna

/**
 *
 * @author ningrum
 */
public class ManajemenData {

    // Metode utama yang dieksekusi ketika program berjalan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna
        
        System.out.println("Data Dosen :");
        System.out.print("Masukkan Jenis Dosen (tetap/tidak tetap): ");
        String pilihan = input.nextLine(); // Membaca input jenis dosen
        
        // Mengecek apakah dosen yang dimasukkan adalah "tetap"
        if (pilihan.equalsIgnoreCase("tetap")) {
            System.out.println("Masukkan nama : ");
            String nama = input.nextLine(); // Membaca nama dosen
            System.out.print("Masukkan NIK : ");
            String nik = input.nextLine(); // Membaca NIK dosen
            System.out.print("Masukkan Umur : ");
            int umur = input.nextInt(); // Membaca umur dosen
            System.out.print("Masukkan Jenis Kelamin (L/P): ");
            char jenisKelamin = input.next().charAt(0); // Membaca jenis kelamin dosen
            System.out.print("Masukkan Gaji Pokok : ");
            double gajiPokok = input.nextDouble(); // Membaca gaji pokok dosen
            System.out.print("Masukkan Tunjangan : ");
            double tunjangan = input.nextDouble(); // Membaca tunjangan dosen
            
            // Membuat objek DosenTetap dengan data yang telah dibaca
            DosenTetap dosenTetap = new DosenTetap(nama, nik, umur, jenisKelamin, gajiPokok, tunjangan);
            System.out.println("\nInformasi Data Dosen Tetap : ");
            dosenTetap.tampilkanInfo(); // Menampilkan informasi dosen tetap
        
        // Mengecek apakah dosen yang dimasukkan adalah "tidak tetap"
        } else if (pilihan.equalsIgnoreCase("tidak tetap")) {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine(); // Membaca nama dosen
            System.out.print("Masukkan NIK: ");
            String nik = input.nextLine(); // Membaca NIK dosen
            System.out.print("Masukkan Umur: ");
            int umur = input.nextInt(); // Membaca umur dosen
            System.out.print("Masukkan Jenis Kelamin (L/P): ");
            char jenisKelamin = input.next().charAt(0); // Membaca jenis kelamin dosen
            System.out.print("Masukkan Jam Mengajar: ");
            int jamMengajar = input.nextInt(); // Membaca jumlah jam mengajar dosen
            System.out.print("Masukkan Honor Per Jam: ");
            double honorPerjam = input.nextDouble(); // Membaca honor per jam dosen
            
            // Membuat objek DosenTidakTetap dengan data yang telah dibaca
            DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(nama, nik, umur, jenisKelamin, jamMengajar, honorPerjam);
            System.out.println("\nInformasi Data Dosen Tidak Tetap:");
            dosenTidakTetap.tampilkanInfo(); // Menampilkan informasi dosen tidak tetap
            
        } else {
            System.out.println("Pilihan Anda tidak valid!"); // Pesan jika pilihan tidak valid
        }
    }
    
}
