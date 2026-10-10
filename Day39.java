import java.util.Scanner;
 public class Day39 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan angka pertama: ");
         double angka1 = input.nextDouble();
         
         System.out.print("Masukkan angka kedua: ");
         double angka2 = input.nextDouble();
         
         System.out.print("Masukkan simbol operasi (+, -, *, /, %): ");
         char operasi = input.next().charAt(0);
         
         double hasil = 0;
         
         if (operasi == '+') {
             hasil = angka1 + angka2;
             System.out.println("Hasil dari " + angka1 + " + " + angka2 + " adalah " + hasil);
         }
         else if (operasi == '-') {
             hasil = angka1 - angka2;
             System.out.println("Hasil dari " + angka1 + " - " + angka2 + " adalah " + hasil);
         }
         else if (operasi == '*') {
             hasil = angka1 * angka2;
             System.out.println("Hasil dari " + angka1 + " * " + angka2 + " adalah " + hasil);
         }
         else if (operasi == '/') {
             if (angka2 == 0) {
                 System.out.println("Error, tidak terdefinisi");
             } else {
                 hasil = angka1 / angka2;
                 System.out.println("Hasil dari " + angka1 + " / " + angka2 + " adalah " + hasil);
             }
         }
         else if (operasi == '%') {
             if (angka2 == 0) {
                 System.out.println("Error, tidak terdefinisi");
             } else {
                 hasil = angka1 % angka2;
                 System.out.println("Hasil dari " + angka1 + " % " + angka2 + " adalah " + hasil);
             }
         }
         else {
             System.out.println("Waduhhh, Operasi yang anda masukkan tidak ada!!!");
         }
     }
     }
