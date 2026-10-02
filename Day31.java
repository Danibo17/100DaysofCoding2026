import java.util.Scanner;
 public class Day31 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan umur : ");
         int umur = input.nextInt();
         
         System.out.print("Masukkan nilai tugas : ");
         int nilaiTugas = input.nextInt();
         
         System.out.print("Apakah sudah terdaftar? (true/false) : ");
         boolean sudahDaftar = input.nextBoolean();
         
         boolean semuaSyarat = (umur >= 17) && (nilaiTugas >= 75) && (sudahDaftar == true);
      
         boolean salahSatuSyarat = (umur >= 17) || (nilaiTugas >= 75) || (sudahDaftar == true);
         
         boolean belumDaftar = !sudahDaftar;
         
         System.out.println("Memenuhi semua syarat : " + semuaSyarat);
         System.out.println("Memenuhi salah satu syarat : " + salahSatuSyarat);
         System.out.println("Belum terdaftar : " + belumDaftar);
     }
 }
