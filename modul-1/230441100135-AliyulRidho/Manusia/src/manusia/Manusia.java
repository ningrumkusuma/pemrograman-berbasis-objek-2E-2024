/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author Ridho
 */
public class Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    TipeManusia tipe1= new TipeManusia ();
    TipeManusia tipe2= new TipeManusia ();
    TipeManusia tipe3= new TipeManusia ();
    
    tipe1.Nama="Gupron Kopling";
    tipe1.Umur=18;
    tipe1.Alamat="Galis Sity";
    
    tipe2.Nama="Abas Busi";
    tipe2.Umur=19;
    tipe2.Alamat="Muragung Town";
    
    tipe3.Nama="Adit Tromol";
    tipe3.Umur=19;
    tipe3.Alamat="Sumber Pocong";
    
    
    System.out.println("Nama    : "+tipe1.Nama);
    System.out.println("Umur    : "+tipe1.Umur+" Tahun");
    System.out.println("Alamat  : "+tipe1.Alamat);
        System.out.println("");
    System.out.println("Nama    : "+tipe2.Nama);
    System.out.println("Umur    : "+tipe2.Umur+" Tahun");
    System.out.println("Alamat  : "+tipe2.Alamat);
        System.out.println("");
    System.out.println("Nama    : "+tipe3.Nama);
    System.out.println("Umur    : "+tipe3.Umur+" Tahun");
    System.out.println("Alamat  : "+tipe3.Alamat);
        System.out.println("");
    
        //method
    tipe3.Berlari();
    tipe2.berjalan();
    
    }
    
}
