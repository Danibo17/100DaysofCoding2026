import java.util.Scanner;
 public class Day77 {
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
         
         String namaTrim = nama.trim();
         int jumlahKarakter = namaTrim.length();
         String namaKapital = namaTrim.toUpperCase();
         String namaKecil = namaTrim.toLowerCase();
         String tigaHuruf = namaTrim.substring(0, 3);
         String namaGanti = namaTrim.replace(" ", "_");
         
         boolean namaKosong = namaTrim.isEmpty();
         boolean namaSesuai = namaTrim.equals(konfirmasiNama.trim());
         boolean prodiSesuai = prodi.equalsIgnoreCase("Informatika");
         boolean emailKampus = email.contains("@kampus.ac.id");
         
         System.out.println("Nama Setelah Trim\t: " + namaTrim);
         System.out.println("Jumlah Karakter\t\t: " + jumlahKarakter);
         System.out.println("Nama Huruf Kapital\t: " + namaKapital);
         System.out.println("Nama Huruf Kecil\t: " + namaKecil);
         System.out.println("Tiga Karakter Pertama\t: " + tigaHuruf);
         System.out.println("Nama Setelah Replace\t: " + namaGanti);
         
         System.out.println("Nama Kosong\t\t: " + namaKosong);
         System.out.println("Konfirmasi Nama Sesuai\t: " + namaSesuai);
         System.out.println("Program Studi Sesuai\t: " + prodiSesuai);
         System.out.println("Email Kampus\t\t: " + emailKampus);
         
     }
 }
