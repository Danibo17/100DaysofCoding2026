import java.util.Scanner;
 public class Day73 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan nama lengkap: ");
         String nama = input.nextLine();
         
         System.out.println("Nama Asli      : " + nama);
         System.out.println("Jumlah Karakter: " + nama.length());
         System.out.println("Huruf Kapital  : " + nama.toUpperCase());
         System.out.println("Huruf Kecil    : " + nama.toLowerCase());
         
     }
 }
