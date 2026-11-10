import java.util.Scanner;
 public class Day70 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan jumlah baris: ");
         int n = input.nextInt();
         for (int baris = 1; baris <= n; baris++) {
             for (int kolom = n; kolom >= baris; kolom--) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
 }
