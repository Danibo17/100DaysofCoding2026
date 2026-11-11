import java.util.Scanner;
 public class Day71 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         int total = 0;
         int nominal;
         
         System.out.print("Masukkan pemasukan (angka negatif untuk berhenti): ");
         nominal = input.nextInt();
         
         while (nominal >= 0) {
             total = total + nominal;
             System.out.print("Masukkan pemasukan (angka negatif untuk berhenti): ");
             nominal = input.nextInt();
         }
         
         System.out.println("Total seluruh pemasukan: Rp " + total);
     }
 }
