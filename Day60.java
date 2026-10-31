import java.util.Scanner;
 public class Day60 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         int jumlah = 0;
         
         for(int i = 1; i <= n; i++){
             jumlah = jumlah + i;
         }
         System.out.println(jumlah);
     }
 }
