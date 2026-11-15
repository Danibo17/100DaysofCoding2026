import java.util.Scanner;
 public class Soal06 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan batas akhir n: ");
         int n = input.nextInt();
         
         int total = 0;
         
         for (int i = 1; i <= n; i++) {
             total = total + i; 
         }
         
         System.out.println("Total penjumlahan 1 hingga " + n + " = " + total);
        
     }
 }
