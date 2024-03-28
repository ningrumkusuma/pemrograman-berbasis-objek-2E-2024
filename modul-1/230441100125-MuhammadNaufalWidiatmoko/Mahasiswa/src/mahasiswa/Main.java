/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa();

        System.out.println("Masukkan data mahasiswa pertama:");
        mahasiswa1.inputData(scanner);

        System.out.println("\nMasukkan data mahasiswa kedua:");
        mahasiswa2.inputData(scanner);

        System.out.println("\nData Mahasiswa Pertama:");
        mahasiswa1.tampilkanData();

        System.out.println("\nData Mahasiswa Kedua:");
        mahasiswa2.tampilkanData();
    }
}
