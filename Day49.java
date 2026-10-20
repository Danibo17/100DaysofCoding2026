import java.util.Scanner;
 public class Day49 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan total belanja: ");
         int totalBelanja = input.nextInt();
         
         String kategori = (totalBelanja >= 500000) ? "Pelanggan VIP" : "Pelanggan Reguler";
         
         String bonus = (totalBelanja % 2 == 0) ? "Voucher Cashback" : "Poin Reward";
         
         System.out.println("===== DATA PELANGGAN =====");
         System.out.println("Total Belanja: " + totalBelanja);
         System.out.println("Kategori: " + kategori);
         System.out.println("Bonus: " + bonus);
         
     }
 }
