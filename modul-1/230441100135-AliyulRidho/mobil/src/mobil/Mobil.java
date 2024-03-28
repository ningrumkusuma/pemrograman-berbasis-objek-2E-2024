/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

/**
 *
 * @author Ridho
 */
public class Mobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek
        Mobil2 nissan = new Mobil2();
        //mengisi atribut
        nissan.warna="Hitam";
        nissan.merk="nissan GTR";
        nissan.bentuk="keren cui";
        nissan.tahun = 2020;
        
        //mencetak atribut pada objek
        System.out.println("warna mobil : "+nissan.warna);
        System.out.println("merk mobil  : "+nissan.merk);
        System.out.println("bentuk mobil: "+nissan.bentuk);
        System.out.println("tahun mobil : "+nissan.tahun);
        
        //mencetaak method
        nissan.melaju();
        nissan.ngerem();
        nissan.berbelok();
        nissan.berhenti();
    }
    
}
