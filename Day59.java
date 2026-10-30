import java.util.Scanner;
 public class Day59 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n = input.nextInt();
         int m = input.nextInt();
         
         for(int i = m; i <= n; i += m){
             System.out.print(i + " ");
         }
     }
 }
