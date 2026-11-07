import java.util.Scanner;
 public class Day67 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         
         for(int baris = 1; baris <= n; baris++){
             for(int kolom = 1; kolom <= n; kolom++){
                 System.out.print("* ");
             }
             System.out.println();
         }
     }
 }
