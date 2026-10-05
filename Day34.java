import java.util.Scanner;
 public class Day34 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan nilai ujian : ");
         int nilai = input.nextInt();
         
         System.out.print("Apakah sudah terdaftar? : ");
         boolean sudahDaftar = input.nextBoolean();
         
         String kategori;
         if (nilai >= 80 && nilai <= 100) {
             kategori = "Sangat Baik";
         } else if (nilai >= 70 && nilai <= 79) {
             kategori = "Baik";
         } else if (nilai >= 60 && nilai <= 69) {
             kategori = "Cukup";
         } else {
             kategori = "Kurang";
         }
         
         String status;
         if (nilai >= 60 && sudahDaftar == true) {
             status = "Lulus";
         } else {
             status = "Tidak Lulus";
         }
         
         System.out.println("Kategori Nilai : " + kategori);
         System.out.println("Status         : " + status);
         
     }
               }
