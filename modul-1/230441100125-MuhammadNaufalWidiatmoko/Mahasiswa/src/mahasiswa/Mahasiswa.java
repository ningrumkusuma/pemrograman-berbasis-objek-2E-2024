/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    String alamat;

    public void inputData(Scanner input) {
        System.out.println("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.println("Masukkan Program Studi/Jurusan: ");
        prodi = input.nextLine();
        System.out.println("Masukkan Alamat: ");
        alamat = input.nextLine();
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi/Jurusan: " + prodi);
        System.out.println("Alamat: " + alamat);
    }
}
