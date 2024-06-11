/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa{
    static String universitas;
    String nama;
    String nim;
    String jurusan;
    String alamat;

//    constructor
    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
       this.nama = nama;
       this.nim = nim;
       this.jurusan = jurusan;
       this.alamat = alamat;  
    }
    public static void setUniversitas(String universitas) {
    Mahasiswa.universitas = universitas;
    }
    public static String getUniversitas() {
        return universitas;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama ;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNim(){
        return nim ;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getAlamat(){
        return alamat ;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
     public String getJurusan(){
        return jurusan ;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        String inputLagi;
        do {
            System.out.print("Masukkan Universitas\t: ");
            Mahasiswa.universitas = input.next();
            input.nextLine();
            
            System.out.print("Masukkan NIM \t: ");
            String nim = input.next();
            input.nextLine();

            System.out.print("Masukkan Nama \t: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Alamat\t: ");
            String alamat = input.nextLine();

            System.out.println("Pilihan Jurusan:");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("Masukkan Kode Jurusan\t: ");
            String kodeJurusan = input.next();
            String jurusan;

            // Menggunakan switch-case konvensional
            switch (kodeJurusan) {
                case "41":
                    jurusan = "TEKNIK INFORMATIKA";
                    break;
                case "42":
                    jurusan = "TEKNIK INDUSTRI";
                    break;
                case "43":
                    jurusan = "TEKNIK ELEKTRO";
                    break;
                case "44":
                    jurusan = "SISTEM INFORMASI";
                    break;
                case "48":
                    jurusan = "TEKNIK MESIN";
                    break;
                case "49":
                    jurusan = "TEKNIK MEKATRONIKA";
                    break;
                default:
                    jurusan = "jurusan yang anda pilih tidak ada, pilih kode jurusan dengan benar";
            }
// objek
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim,jurusan, alamat);
            daftarMahasiswa.add(mahasiswa);

            System.out.println("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
            inputLagi = input.next();
        } 
        while (inputLagi.equalsIgnoreCase("Y"));

        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mahasiswa1 : daftarMahasiswa) {
            System.out.println("Universitas : " + Mahasiswa.getUniversitas());
            System.out.println("NIM \t: " + mahasiswa1.getNim());
            System.out.println("Nama \t: " + mahasiswa1.getNama());
            System.out.println("Alamat \t: " + mahasiswa1.getAlamat());
            System.out.println("Jurusan\t: " + mahasiswa1.getJurusan());
           
        }
    }
}
