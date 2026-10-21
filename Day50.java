import java.util.Scanner;
 public class Day50 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan sebuah bilangan: ");
         int bilangan = input.nextInt();
         
         String status = (bilangan % 2 == 0) ? "Genap" : "Ganjil";
         
         System.out.println("Bilangan " + bilangan + " adalah " + status);
         
     }
 }
