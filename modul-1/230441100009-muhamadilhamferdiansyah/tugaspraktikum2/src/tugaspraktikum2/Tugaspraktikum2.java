/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum2;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Tugaspraktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
            
        String Nama, Prodi, Alamat;
        String NIM;
 

        System.out.print("Masukkan Nama Anda : ");
        Nama = input.nextLine();
        System.out.print("Masukka NIM Anda : ");
        NIM = input.nextLine();
        System.out.print("Masukkan Prodi Anda : ");
        Prodi = input.nextLine();
        System.out.print("Masukkan Alamat Anda : ");
        Alamat = input.nextLine();



        System.out.println(" ");
        System.out.println("Nama : " +Nama);  
        System.out.println("NIM : " +NIM);
        System.out.println("Prodi : " +Prodi);
        System.out.println("Alamat : " +Alamat);


    }
    
}
