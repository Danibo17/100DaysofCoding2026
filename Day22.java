import java.util.Scanner;
 public class Day21 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan nilai a : ");
         int a = input.nextInt();
         
         System.out.print("Masukkan nilai b : ");
         int b = input.nextInt();
         
         int aAwal = a;
         int bAwal = b;
         int temp = a;
         a = b;
         b = temp;
         
         int aCara1 = a;
         int bCara1 = b;
         a = aAwal;
         b = bAwal;
         a = a + b;
         b = a - b;
         a = a - b;
         System.out.println("\nSebelum ditukar:");
         System.out.printf("a = %d%n", aAwal);
         System.out.printf("b = %d%n", bAwal);
         System.out.println("\nDengan variabel tambahan:");
         System.out.printf("a = %d%n", aCara1);
         System.out.printf("b = %d%n", bCara1);
         System.out.println("\nTanpa variabel tambahan:");
         System.out.printf("a = %d%n", a);
         System.out.printf("b = %d%n", b);
         input.close();
     }
 }
