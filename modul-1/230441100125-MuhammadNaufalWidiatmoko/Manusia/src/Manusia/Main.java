/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manusia;

public class Main {

    public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        Manusia orang3 = new Manusia();
        
        orang1.Nama = "Denis";
        orang1.Alamat = "Vrindavan";
        orang1.Umur = 15;
        System.out.println("Nama Objek 1 adalah : " + orang1.Nama);
        System.out.println("Objek 1 Berasal dari : " + orang1.Alamat);
        System.out.println("Umur Objek 1 adalah : " + orang1.Umur);
        orang1.berjalan(); 
        orang1.berlari();
        
        orang2.Nama = "Ladusing";
        orang2.Alamat = "Nganjuk";
        orang2.Umur = 30;
        System.out.println("Nama Objek 2 adalah : " + orang2.Nama);
        System.out.println("Objek 2 Berasal : " + orang2.Alamat);
        System.out.println("Umur Objek 2 adalah : " + orang2.Umur);
        orang2.berjalan();
        orang2.berlari();
        
        orang3.Nama = "Suparman";
        orang3.Alamat = "Ohio";
        orang3.Umur = 24;
        System.out.println("Nama Objek 1 adalah : " + orang3.Nama);
        System.out.println("Objek 1 Berasal dari : " + orang3.Alamat);
        System.out.println("Umur Objek 1 adalah : " + orang3.Umur);
        orang3.berjalan(); 
        orang3.berlari();
    }
}
