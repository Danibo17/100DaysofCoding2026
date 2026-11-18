import java.util.Scanner;
 public class Day78 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
         System.out.println("=== REGISTRASI AKUN ===");
         System.out.print("Buat username: ");
         String usernameBenar = input.nextLine();
         
         System.out.print("Buat password: ");
         String passwordBenar = input.nextLine();
         
         System.out.println("Akun berhasil dibuat!\n");
         
         System.out.println("=== LOGIN AKUN ===");
         String usernameMasuk, passwordMasuk;
         
         do {
             System.out.print("Masukkan username: ");
             usernameMasuk = input.nextLine();
             
             System.out.print("Masukkan password: ");
             passwordMasuk = input.nextLine();
             
             if (!(usernameMasuk.equals(usernameBenar) && passwordMasuk.equals(passwordBenar))) {
                 System.out.println("Username atau password salah.");
                 System.out.println("Silakan login kembali.\n");
             }
             
         } while (!(usernameMasuk.equals(usernameBenar) && passwordMasuk.equals(passwordBenar)));
         
         System.out.println("Selamat, Login Berhasil!");
         
     }
 }
