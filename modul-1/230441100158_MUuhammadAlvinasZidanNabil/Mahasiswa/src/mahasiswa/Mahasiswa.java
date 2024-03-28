/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
import java.util.Scanner;

/**
 *
 * @author slebew
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama,prodi,alamat, nim;
        
        Scanner inputan = new Scanner(System.in);
    
System.out.print("Ketik Nama Mahasiswa \t : ");
nama = inputan.nextLine();
System.out.print("Ketik Nim Mahasiswa \t : ");
nim = inputan.nextLine();
System.out.print("Ketik Prodi Mahasiswa \t : ");
prodi = inputan.nextLine();
System.out.print("Ketik Alamat Mahasiswa \t : ");
alamat = inputan.nextLine();
    
System.out.println();
System.out.println("==========''=========");
System.out.println("Nama Mahasiswa : " + nama);
System.out.println("Nim Mahasiswa : " + nim);
System.out.println("Prodi Mahasiswa : " + prodi);
System.out.println("Alamat Mahasiswa : " + alamat);
    }    
}
