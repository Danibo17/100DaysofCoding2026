import java.util.Scanner;
 public class Soal08 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan tinggi segitiga n: ");
         int n = input.nextInt();
         
         for (int baris = 1; baris <= n; baris++) {
             for (int kolom = 1; kolom <= baris; kolom++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
     }
 }
