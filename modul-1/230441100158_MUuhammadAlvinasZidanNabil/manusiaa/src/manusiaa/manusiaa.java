/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusiaa;

/**
 *
 * @author ASUS
 */

//perintah

class manusia{
    String nama,alamat;
    int umur;
    
    void berlari(){
        System.out.println( nama + " sedang berlari");
    }
    
    void berjalan(){
        System.out.println( nama + " sedang berjalan");
    }
}

public class manusiaa {
    public static void main(String[] args) {
//        objek 2
        manusia orang1 = new manusia();
        manusia orang2 = new manusia();
        
        orang1.nama = "lukman";
        orang1.umur = 19;
        orang1.alamat = "bangkalan";
        
        System.out.println("nama dari orang yang pertama adalah " + orang1.nama);
        System.out.println("Orang pertama beralamat di " + orang1.alamat);
        System.out.println("umur dari orang yang pertama adalah " + orang1.umur + " tahun ");
        
        orang1.berjalan();
        orang1.berlari();
        
        System.out.println("------------------------------------------------");
        
        orang2.nama = "zidan";
        orang2.umur = 20;
        orang2.alamat= "banyuates";
        
        System.out.println("nama dari orang kedua adalah " + orang2.nama);
        System.out.println("orang kedua beralamat di " + orang2.alamat);
        System.out.println("umur dari orang kedua adalah " + orang2.umur + " tahun ");
        
        orang2.berjalan();
        orang2.berlari();
        System.out.println();
        
        System.out.println("Terimakasih");
    }
    
}





















////public class manusiaa{
//public class Manusiaa {
//    // Atribut
//    String nama1;
//    int umur1;
//    String alamat1;
//
//    // Konstruktor
//    public Manusiaa(String nama, int umur, String alamat) {
//        //this untuk tidak menduplikat
//        nama1 = nama;
//        umur1 = umur;
//        alamat1 = alamat;
//    }
//
//    // Metode berjalan
//    void berjalan() {
//        System.out.println(nama1 +umur1 +alamat1 + " sedang berjalan.");
//    }
//
//    // Metode berlari
//    void berlari() {
//        System.out.println(nama1 + umur1 + alamat1 + " sedang berlari.");
//    }
//
//    // Metode utama (main method)-
//    public static void main(String[] args) {
//        // Membuat beberapa objek Manusia
//        Manusiaa orang1 = new Manusiaa ("zidan ", 19, " sampang banyuates");
//        orang1.berjalan();
//    
//        Manusiaa orang2 = new Manusiaa("iklil ", 19, " Bangkalan");
//        orang2.berlari();
//    
//        
//        Manusiaa orang3 = new Manusiaa("niko ", 19, " bojonegoro");
//        orang3.berjalan();
//    
//
//        // Memanggil metode berjalan dan berlari untuk setiap objek
//    }
//}  

    