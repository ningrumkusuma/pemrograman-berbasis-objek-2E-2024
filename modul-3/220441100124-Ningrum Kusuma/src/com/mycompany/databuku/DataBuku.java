package com.mycompany.databuku;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ningrum
 */
public class DataBuku {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Membuat objek Scanner untuk mengambil input dari pengguna
        ArrayList<perpustakaan> listbuku = new ArrayList<>();  // Membuat ArrayList untuk menyimpan data buku
        int jumlah;

        // Meminta pengguna untuk memasukkan jumlah buku
        System.out.print("Masukkan Jumlah Buku :");
        jumlah = scan.nextInt();

        // Mengulangi sebanyak jumlah buku yang telah dimasukkan
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Buku ke-" + (i + 1));

            // Meminta pengguna untuk memasukkan data buku
            System.out.print("Masukkan Judul :");
            String judul = scan.next();
            System.out.print("Masukkan Penulis :");
            String penulis = scan.next();
            System.out.print("Masukkan Publisher :");
            String publisher = scan.next();
            System.out.print("Masukkan Kategori :");
            String kategori = scan.next();
            System.out.print("Masukkan Stok :");
            int stok = scan.nextInt();
            System.out.print("Masukkan Tahun Terbit :");
            int thn_terbit = scan.nextInt();

            // Menambahkan objek buku ke dalam listbuku berdasarkan kategori
            if (kategori.equals("D")) {
                Dewasa dewasa = new Dewasa(judul, penulis, publisher, stok, thn_terbit);
                listbuku.add(dewasa);
            } else if (kategori.equals("R")) {
                Remaja remaja = new Remaja(judul, penulis, publisher, stok, thn_terbit);
                listbuku.add(remaja);
            } else if (kategori.equals("A")) {
                Anak anak = new Anak(judul, penulis, publisher, stok, thn_terbit);
                listbuku.add(anak);
            } else {
                SemuaUmur semuaumur = new SemuaUmur(judul, penulis, publisher, stok, thn_terbit);
                listbuku.add(semuaumur);
            }
        }

        // Menampilkan data buku yang telah dimasukkan
        System.out.println("Data Buku :");
        for (perpustakaan perpus : listbuku) {
            perpus.print();
            System.out.println("");
        }
    }
}
