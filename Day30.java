import java.util.Scanner;
 public class Day30 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
         System.out.print("Masukkan nilai pertama : ");
         int nilai1 = input.nextInt();
         
         System.out.print("Masukkan nilai kedua   : ");
         int nilai2 = input.nextInt();
        
         boolean lebihKecilSama = nilai1 <= nilai2;
         boolean lebihBesarSama = nilai1 >= nilai2;
        
         System.out.println("Nilai pertama lebih kecil dari atau sama dengan nilai kedua : " + lebihKecilSama);
         System.out.println("Nilai pertama lebih besar dari atau sama dengan nilai kedua : " + lebihBesarSama);

     }
 }
