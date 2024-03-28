package soal2;
import java.util.Scanner;
public class siswa {
        public static void main(String[] args) {
     
        String nama, prodi,alamat;
        int nim;
        

        // membuat scanner baru
         Scanner imellda = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### data mahasiswa ###");
        System.out.print("Nama: ");
        nama = imellda.nextLine();
        System.out.print("Alamat: ");
        alamat = imellda.nextLine(); 
        System.out.print("prodi: ");
        prodi = imellda.nextLine();
        System.out.print("nim: ");
        nim = imellda.nextInt();
}

  
}
