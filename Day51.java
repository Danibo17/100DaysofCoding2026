import java.util.Scanner;
 public class Day51 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan tinggi segitiga: ");
         int tinggi = input.nextInt();
      
         for (int baris = 1; baris <= tinggi; baris++) {
             
             for (int kolom = 1; kolom <= baris; kolom++) {
                 System.out.print(kolom + " ");
             }
             
             System.out.println();
         }
     }
 }
