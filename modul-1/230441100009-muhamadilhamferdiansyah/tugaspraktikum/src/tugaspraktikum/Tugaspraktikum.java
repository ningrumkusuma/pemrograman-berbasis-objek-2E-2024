/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum;


class Manusia {
    String Nama;
    String Alamat;
    int Umur;
    
    public void berjalan(){
        System.out.println("Objek " + this.Nama + " sedang berjalan");
    }
    
    void berlari () {
        System.out.println("Objek " + this.Nama + " sedang berlari"); 
    }
}

/**
 *
 * @author Lenovo
 */
public class Tugaspraktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.Nama = "Rusdi";
        orang1.Umur = 20;
        orang1.Alamat = "Ngawi";
        System.out.println("Nama Objek 1 adalah : " + orang1.Nama);
        System.out.println("Umur Objek 1 adalah : " + orang1.Umur);
        System.out.println("Objek 1 Berasal : " + orang1.Alamat);
        orang1.berjalan(); 
        orang1.berlari();
        
        orang2.Nama = "Faiz";
        orang2.Umur = 21;
        orang2.Alamat = "Nganjuk";
        System.out.println("Nama Objek 2 adalah : " + orang2.Nama);
        System.out.println("Umur Objek 2 adalah : " + orang2.Umur);
        System.out.println("Objek 2 Berasal : " + orang2.Alamat);
        orang2.berjalan();
        orang2.berlari();

        
    }
    
}
