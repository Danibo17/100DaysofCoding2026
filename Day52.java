import java.util.Scanner;
 public class Day52 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         final int PIN_BENAR = 123456;
         int pinUser;
         
         System.out.print("Masukkan PIN: ");
         pinUser = input.nextInt();
         
         while (pinUser != PIN_BENAR) {
             System.out.println("PIN Salah. Silakan coba lagi.");
             System.out.print("Masukkan PIN: ");
             pinUser = input.nextInt();
         }
         
         System.out.println("PIN Benar. Akses Diberikan.");
     }
 }
