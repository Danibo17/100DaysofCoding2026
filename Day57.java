import java.util.Scanner;
 public class Day57 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         
         for(int i = 1; i <= n; i += 2){
             System.out.print(i + " ");
         }
         System.out.println();
         
         for(int i = 2; i <= n; i += 2){
             System.out.print(i + " ");
         }
     }
 }
