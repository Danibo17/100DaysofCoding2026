import java.util.Scanner;
 public class Day35 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Apakah sudah terdaftar? : ");
         boolean sudahDaftar = input.nextBoolean();
         
         if (sudahDaftar == true) {
             
             System.out.print("Masukkan nilai DDP : ");
             int ddp = input.nextInt();
             
             System.out.print("Masukkan nilai PBO : ");
             int pbo = input.nextInt();
             
             System.out.print("Masukkan nilai FWB : ");
             int fwb = input.nextInt();
             
             double rataRata = (ddp + pbo + fwb) / 3.0;
             
             System.out.println("Rata-rata nilai : " + rataRata);
             
             if (rataRata >= 75) {
                 System.out.println("Status : Boleh Mengikuti Lomba");
             } else {
                 System.out.println("Status : Nilai Belum Memenuhi Syarat");
             }
         }
         else {
             System.out.println("Status : Belum Terdaftar");
         }
     }
 }
