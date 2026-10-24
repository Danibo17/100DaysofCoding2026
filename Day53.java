import java.util.Scanner;
 public class Day53 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int totalMenu = 0;
         String pesanLagi;
         
         do {
             System.out.print("Masukkan nama menu: ");
             String menu = input.nextLine();
             System.out.println("[Pesanan dicatat...]");
             totalMenu++;
             
             System.out.print("Pesan lagi (y/t)? ");
             pesanLagi = input.nextLine();
             
         } while (pesanLagi.equalsIgnoreCase("y"));
         
         System.out.println("Pemesanan Selesai!");
         System.out.println("Total pesanan Anda: " + totalMenu + " menu");
         
     }
 }
