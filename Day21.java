import java.util.Scanner;
 public class Day21 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         // 1. MASUKKAN SEMUA SEBAGAI STRING
         System.out.print("Nama         : ");
         String nama = input.nextLine();
         System.out.print("Umur         : ");
         String sUmur = input.nextLine();
         System.out.print("Tinggi Badan : ");
         String sTinggi = input.nextLine();
         System.out.print("Huruf Awal   : ");
         String sHuruf = input.nextLine();
         System.out.print("Status       : ");
         String sStatus = input.nextLine();
         System.out.print("Saldo Awal   : ");
         String sSaldo = input.nextLine();
         // 2. UBAH KE TIPE YANG SESUAI
         int umur = Integer.parseInt(sUmur);
         double tinggi = Double.parseDouble(sTinggi);
         char huruf = sHuruf.charAt(0);
         boolean aktif = Boolean.parseBoolean(sStatus);
         double saldo = Double.parseDouble(sSaldo);
         // 3. PROSES
         umur += 1;
         saldo += 50000;
         saldo -= 25000;
         saldo *= 2;
         saldo /= 5;
         // 4. TAMPILKAN
         System.out.println("\n===== BIODATA MAHASISWA =====");
         System.out.printf("Nama       : %s%n", nama);
         System.out.printf("Huruf Awal : %c%n", huruf);
         System.out.printf("Umur       : %d tahun%n", umur);
         System.out.printf("Tinggi     : %.1f cm%n", tinggi);
         System.out.printf("Aktif      : %b%n", aktif);
         System.out.printf("Saldo Akhir: Rp%.0f%n", saldo);
         System.out.println("=============================");
         input.close();
     }
 }
