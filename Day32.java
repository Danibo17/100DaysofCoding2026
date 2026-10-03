import java.util.Scanner;
 public class Day32 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
         System.out.print("Nilai rata-rata: ");
         int nilai = input.nextInt();
         
         System.out.print("Pendapatan orang tua: ");
         int pendapatan = input.nextInt();
         
         System.out.print("Aktif organisasi? (true/false): ");
         boolean organisasi = input.nextBoolean();
         
         System.out.print("Pernah terima beasiswa lain? (true/false): ");
         boolean beasiswaLain = input.nextBoolean();
         
         boolean syaratNilai = nilai >= 80;
         boolean syaratKeuangan = (pendapatan <= 4000000) || organisasi;
         boolean syaratPenerima = !beasiswaLain;
         
         boolean lolos = syaratNilai && syaratKeuangan && syaratPenerima;
        
         System.out.println("Syarat Nilai terpenuhi: " + syaratNilai);
         System.out.println("Syarat Pendapatan/Organisasi: " + syaratKeuangan);
         System.out.println("Lolos Seleksi Beasiswa: " + lolos);
         
     }
 }
