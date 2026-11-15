import java.util.Scanner;
 public class Soal09 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan nilai n: ");
         int n = input.nextInt();
         
         int hasil = 1;
         
         for (int i = 1; i <= n; i++) {
             hasil = hasil * i;
         }
         
         System.out.println(n + "! = " + hasil);
     }
 }
