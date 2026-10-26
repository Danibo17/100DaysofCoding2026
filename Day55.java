import java.util.Scanner;
 public class Day55 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan batas angka: ");
         int n = input.nextInt();
         
         if (n < 1) {
             System.out.println("Batas tidak valid!");
             return; 
         }
         for (int i = 1; i <= n; i++) {
             if (i == 13) {
                 System.out.println("\nSistem dihentikan di angka 13.");
                 break;
             }
             if (i % 3 == 0) {
                 continue;
             }
             System.out.print(i + " ");
         }
         if (n < 13) {
             System.out.println("\nPencetakan Selesai.");
         }
     }
 }
