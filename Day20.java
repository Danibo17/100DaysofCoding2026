public class Day20 {
     public static void main(String[] args) {
         int angka = 100;
         double desimal = 99.5;
         char huruf = 'A';
         boolean status = true;
         
         String teksAngka = String.valueOf(angka);
         String teksDesimal = String.valueOf(desimal);
         String teksHuruf = String.valueOf(huruf);
         String teksStatus = String.valueOf(status);
         
         System.out.println("=== KONVERSI KE STRING ===");
         System.out.println("int     : " + teksAngka);
         System.out.println("double  : " + teksDesimal);
         System.out.println("char    : " + teksHuruf);
         System.out.println("boolean : " + teksStatus);
     }
 }
