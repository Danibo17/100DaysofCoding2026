import java.util.Scanner;
 public class Day74 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan nama lengkap\t: ");
         String nama = input.nextLine();
         
         System.out.print("Konfirmasi nama lengkap\t: ");
         String konfirmasiNama = input.nextLine();
         
         System.out.print("Masukkan program studi\t: ");
         String prodi = input.nextLine();
         
         System.out.print("Masukkan alamat email\t: ");
         String email = input.nextLine();
         
         boolean namaKosong = nama.isEmpty();
         boolean namaSama = nama.equals(konfirmasiNama);
         boolean prodiSesuai = prodi.equalsIgnoreCase("Informatika");
         boolean emailValid = email.contains("@kampus.ac.id");
         
         System.out.println("\nNama lengkap kosong\t: " + namaKosong);
         System.out.println("Konfirmasi nama\t\t: " + namaSama);
         System.out.println("Program studi sesuai\t: " + prodiSesuai);
         System.out.println("Email kampus valid\t: " + emailValid);
     }
 }
