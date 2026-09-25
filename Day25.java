import java.util.Scanner;
 public class Day25 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         final double PI = 3.14;
         
         System.out.print("Masukkan jari-jari : ");
         double r = input.nextDouble();
         
         double luas = PI * r * r;
         double keliling = 2 * PI * r;
         
         System.out.println("Luas lingkaran : " + luas);
         System.out.println("Keliling lingkaran : " + keliling);
         
     }
 }
