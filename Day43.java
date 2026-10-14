import java.util.Scanner;
 public class Day43 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan bilangan: ");
         int bilangan = input.nextInt();
         
         if (bilangan % 3 == 0 && bilangan % 5 == 0) {
             System.out.println("Kelipatan 3 dan 5");
         }
         else if (bilangan % 3 == 0) {
             System.out.println("Kelipatan 3");
         }
         else if (bilangan % 5 == 0) {
             System.out.println("Kelipatan 5");
         }
         else {
             System.out.println("Bukan kelipatan 3 maupun 5");
         }
         
     }
 }
