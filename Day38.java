import java.util.Scanner;
 public class Day38 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.println("=== MENU WARTEG CYBER 2077 ===");
         System.out.println("1. Nasi Hologram (Rp 15.000)");
         System.out.println("2. Ayam Goreng Laser (Rp 20.000)");
         System.out.println("3. Es Teh Matrix (Rp 5.000)");
         System.out.println("================================");
         
         System.out.print("Masukkan nomor pesanan : ");
         int nomorMenu = input.nextInt();
         
         if (nomorMenu < 1 || nomorMenu > 3) {
             System.out.println("Waduhhh pesanan yang kamu masukkan tidak ada di menu!!!");
             
         }
         
         String namaMenu = "";
         int hargaSatuan = 0;
         if (nomorMenu == 1) {
             namaMenu = "Nasi Hologram";
             hargaSatuan = 15000;
         } else if (nomorMenu == 2) {
             namaMenu = "Ayam Goreng Laser";
             hargaSatuan = 20000;
         } else if (nomorMenu == 3) {
             namaMenu = "Es Teh Matrix";
             hargaSatuan = 5000;
         }
         
         System.out.print("Masukkan jumlah porsi : ");
         int jumlahPorsi = input.nextInt();
         
         System.out.print("Apakah punya Member? (true/false): ");
         boolean punyaMember = input.nextBoolean();
         
         int totalAwal = hargaSatuan * jumlahPorsi;
         int diskonBesar = 0;
         int diskonMember = 0;
         
         if (totalAwal > 50000) {
             diskonBesar = totalAwal * 10 / 100;
             System.out.println("Selamat! Anda dapat Diskon Belanja Besar 10% (Potongan Rp " + diskonBesar + ")");
         }
         
         if (punyaMember == true) {
             diskonMember = 5000;
             System.out.println("Diskon Member diterapkan (Potongan Rp 5000)");
         }
         
         int totalBayar = totalAwal - diskonBesar - diskonMember;
         
         System.out.println("----------------------------------------");
         System.out.println("Menu        : " + namaMenu);
         System.out.println("Jumlah      : " + jumlahPorsi + " porsi");
         System.out.println("Total Harga Awal : Rp " + totalAwal);
         System.out.println("----------------------------------------");
         System.out.println("Total yang harus dibayar : Rp " + totalBayar);
         
     }
           }
