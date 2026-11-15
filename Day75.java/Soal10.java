import java.util.Scanner;
 public class Soal10 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan batas akhir n: ");
         int n = input.nextInt();
         
         for (int i = 1; i <= n; i++) {
             if (i > 10) {
                 break;
             }
    
             if (i % 3 == 0) {
                 continue;
             }
             System.out.print(i + " ");
         }
     }
 }
