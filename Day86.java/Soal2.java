import java.util.Scanner;
 public class Soal2 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan jumlah barang: ");
         int jumlah = input.nextInt();
        
         int[] nomor = new int[jumlah];
         for (int i = 0; i < jumlah; i++) {
             System.out.print("Masukkan nomor barang ke-" + (i + 1) + ": ");
             nomor[i] = input.nextInt();
         }
        
         System.out.print("Masukkan nomor barang yang dicari: ");
         int cari = input.nextInt();
         
         boolean ditemukan = false;
         for (int i = 0; i < jumlah; i++) {
             if (nomor[i] == cari) {
                 ditemukan = true;
                 break;
             }
         }
         
         if (ditemukan) {
             System.out.println("Nomor barang " + cari + " ditemukan.");
         } else {
             System.out.println("Nomor barang " + cari + " tidak ditemukan.");
         }
     }
 }
