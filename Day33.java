import java.util.Scanner;
 public class Day33 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan nilai ujian: ");
         int nilai = input.nextInt();
         
         System.out.print("Apakah sudah terdaftar? (true/false): ");
         boolean terdaftar = input.nextBoolean();
         
         if (nilai >= 75 && terdaftar == true) {
             System.out.println("Status : Boleh Mengikuti Ujian");
         } else {
             System.out.println("Status : Belum Boleh Mengikuti Ujian");
         }
         
     }
 }
