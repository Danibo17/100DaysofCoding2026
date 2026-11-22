import java.util.Scanner;
 public class Soal2 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan jumlah barang: ");
         int jumlahBarang = input.nextInt();
         
         int[] harga = new int[jumlahBarang];
         int totalBelanja = 0;
        
         for (int i = 0; i < jumlahBarang; i++) {
             System.out.print("Masukkan harga barang ke-" + (i+1) + ": ");
             harga[i] = input.nextInt();
             System.out.println("Harga barang ke-" + (i+1) + ": " + harga[i]);
             totalBelanja += harga[i];
         }
         
         System.out.println("Total belanja: " + totalBelanja);
     }
 }
