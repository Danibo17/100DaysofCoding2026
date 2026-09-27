import java.util.Scanner;
 public class Day26 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan Nama: ");
         String nama = input.nextLine();
         
         System.out.print("Masukkan NIM: ");
         String nim = input.nextLine();
         
         System.out.print("Masukkan Kelas: ");
         String kelas = input.nextLine();
         
         System.out.print("Masukkan Umur: ");
         int umur = input.nextInt();
         
         input.nextLine();
         System.out.print("Masukkan Prodi: ");
         String prodi = input.nextLine();
         
         System.out.print("Masukkan IPK: ");
         double IPK = input.nextDouble();
         
         System.out.print("Masukkan Status aktif: ");
         boolean statusAktif = input.nextBoolean();
         
         System.out.println("===== DATA MAHASISWA =====");
         System.out.println("Masukkan Nama              : " + nama);
         System.out.println("Masukkan nim               : " + nim);
         System.out.println("Masukkan Kelas             : " + kelas);
         System.out.println("Masukkan Umur              : " + umur);
         System.out.println("Masukkan Prodi             : " + prodi);
         System.out.println("Masukkan IPK               : " + IPK);
         System.out.println("Masukkan Status aktif      : " + statusAktif);
         System.out.println("==========================");
         
     }
 }


import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
        final double phi = 3.14;
        int jariJari = in.nextInt();
        double luas = phi * jariJari * jariJari;
        System.out.println(luas);
}
}


import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
         
        int a = in.nextInt();
        int b = in.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
}
}
