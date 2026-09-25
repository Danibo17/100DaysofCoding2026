import java.util.Scanner;
 public class Day24 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan panjang : ");
         int panjang = input.nextInt();
         
         System.out.print("Masukkan lebar : ");
         int lebar = input.nextInt();
         
         int luas = panjang * lebar;
         int keliling = 2 * (panjang + lebar);
         
         System.out.println("Luas persegi panjang : " + luas);
         System.out.println("Keliling persegi panjang : " + keliling);
         
     }
 }
