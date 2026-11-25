import java.util.Scanner;
 public class Day85 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan jumlah data: ");
         int jumlah = input.nextInt();
         
         int[] nilai = new int[jumlah];
         
         for (int i = 0; i < jumlah; i++) {
             System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
             nilai[i] = input.nextInt();
         }
         int terendah = nilai[0];
         
         for (int i = 1; i < jumlah; i++) {
             if (nilai[i] < terendah) {
                 terendah = nilai[i];
             }
         }
         System.out.println("Nilai terendah: " + terendah);
     }
 }
