import java.util.Scanner;
 public class Soal2 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan jumlah barang: ");
         int jumlah = input.nextInt();
         
         int[] harga = new int[jumlah];
         for (int i = 0; i < jumlah; i++) {
             System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
             harga[i] = input.nextInt();
         }
         
         for (int i = 0; i < jumlah; i++) {
             harga[i] = harga[i] + 5000;
         }
        
         System.out.println("Harga setelah ditambahkan Rp5.000:");
         for (int i = 0; i < jumlah; i++) {
             System.out.print(harga[i] + " ");
         }
         System.out.println();
      
     }
 }
