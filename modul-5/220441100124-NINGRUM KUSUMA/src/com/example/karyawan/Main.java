/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.karyawan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ningrum
 */
public class Main { // Class

    public static void main(String[] args) { // Method
        // Membuat objek ArrayList untuk menyimpan daftar karyawan
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();
        
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Perulangan untuk mengumpulkan data karyawan
        while (true) {
            System.out.println("Masukkan data karyawan:");
            
            // Mengambil input nama
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            // Mengambil input usia
            System.out.print("Usia: ");
            int usia = Integer.parseInt(scanner.nextLine());

            // Mengambil input posisi
            System.out.print("Posisi: ");
            String posisi = scanner.nextLine();

            // Mengambil input jenis karyawan (Tetap/Kontrak)
            System.out.print("Jenis Karyawan (1. Tetap, 2. Kontrak): ");
            int jenisKaryawan = Integer.parseInt(scanner.nextLine());

            // Membuat objek KaryawanTetap atau KaryawanKontrak berdasarkan input jenis karyawan
            if (jenisKaryawan == 1) {
                System.out.print("Gaji Bulanan: ");
                double gajiBulanan = Double.parseDouble(scanner.nextLine());
                daftarKaryawan.add(new KaryawanTetap(nama, usia, posisi, gajiBulanan));
            } else if (jenisKaryawan == 2) {
                System.out.print("Upah Per Jam: ");
                double upahPerJam = Double.parseDouble(scanner.nextLine());

                System.out.print("Jumlah Jam Kerja: ");
                int jumlahJamKerja = Integer.parseInt(scanner.nextLine());

                daftarKaryawan.add(new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja));
            } else {
                System.out.println("Jenis karyawan tidak valid.");
            }

            // Menanyakan apakah ingin menambah karyawan lagi
            System.out.print("Apakah ingin menambah karyawan lagi? (y/n): ");
            String lagi = scanner.nextLine();
            if (!lagi.equalsIgnoreCase("y")) {
                break;
            }
        }

        // Menampilkan data karyawan yang telah dimasukkan
        System.out.println("\nData Karyawan:");
        for (Karyawan karyawan : daftarKaryawan) {
            karyawan.tampilkanData(); // Memanggil method tampilkanData() pada setiap objek karyawan
            System.out.println("-----------------------");
        }

        // Menutup objek Scanner
        scanner.close();
    }
}
