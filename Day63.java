import java.util.Scanner;
 public class Day63 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int m = input.nextInt();
         int n = input.nextInt();
         
         int hasil = 1;
         for(int i = 1; i <= n; i++){
             hasil = hasil * m;
         }
         System.out.println(hasil);
     }
 }
