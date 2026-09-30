import java.util.Scanner;
 public class Day29 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
         System.out.print("Masukkan nilai pertama : ");
         int nilai1 = input.nextInt();
         
         System.out.print("Masukkan nilai kedua   : ");
         int nilai2 = input.nextInt();
        
         boolean lebihKecil = nilai1 < nilai2;
         boolean lebihBesar = nilai1 > nilai2;
        
         System.out.println("Nilai pertama lebih kecil dari nilai kedua : " + lebihKecil);
         System.out.println("Nilai pertama lebih besar dari nilai kedua : " + lebihBesar);

     }
 }
