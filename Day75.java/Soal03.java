import java.util.Scanner;
 public class Soal03 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan batas awal: ");
         int awal = input.nextInt();
         System.out.print("Masukkan batas akhir: ");
         int akhir = input.nextInt();
         
         for (int i = awal; i <= akhir; i++) {
             System.out.print(i + " ");
         }
        
     }
 }
