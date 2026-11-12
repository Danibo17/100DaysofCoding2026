import java.util.Scanner;
 public class Day72 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int pilihan;
         
         do {
             System.out.println("=== KANTIN KAMPUS ===");
             System.out.println("1. Nasi Goreng (Rp15000)");
             System.out.println("2. Mie Goreng (Rp12000)");
             System.out.println("3. Ayam Geprek (Rp18000)");
             System.out.println("4. Keluar");
             System.out.print("\nPilih menu: ");
             pilihan = input.nextInt();
             
             switch (pilihan) {
                 case 1:
                     System.out.println("Anda memilih Nasi Goreng");
                     System.out.println("Harga: Rp15000\n");
                     break;
                 case 2:
                     System.out.println("Anda memilih Mie Goreng");
                     System.out.println("Harga: Rp12000\n");
                     break;
                 case 3:
                     System.out.println("Anda memilih Ayam Geprek");
                     System.out.println("Harga: Rp18000\n");
                     break;
                 case 4:
                     System.out.println("Terima kasih telah menggunakan layanan kantin!");
                     break;
                 default:
                     System.out.println("Menu tidak tersedia\n");
             }
         } while (pilihan != 4);
     }
 }
