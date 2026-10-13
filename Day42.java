import java.util.Scanner;
 public class Day42 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan gaji pokok: ");
         double gajiPokok = input.nextDouble();
         
         System.out.print("Masukkan potongan bulanan: ");
         double potongan = input.nextDouble();
         
         double gajiBersih = gajiPokok - potongan;
         
         if (gajiBersih == 0 && gajiPokok > 0) {
             System.out.println("Gaji Bersih Nol: Harap Hubungi HRD!");
         }
         else if (gajiBersih >= 5000000 && gajiBersih <= 10000000 && potongan >= 500000 && potongan <= 1000000) {
             System.out.println("Gaji Bersih Standar");
         }
         else if (gajiBersih < 5000000 || potongan > 1000000) {
             System.out.println("Gaji Bersih Terlalu Rendah atau Potongan Terlalu Besar");
         }
         else if (gajiBersih > 10000000 || potongan < 500000) {
             System.out.println("Gaji Bersih Tinggi atau Potongan Sangat Kecil");
         }
         
     }
 }
