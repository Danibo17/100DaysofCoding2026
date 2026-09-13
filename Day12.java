import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== INPUT BIODATA MAHASISWA ===");

        System.out.print("Masukkan nama         : ");
        String nama = input.nextLine();

        System.out.print("Masukkan nim          : ");
        String nim = input.nextLine();

        System.out.print("Masukkan kelas        : ");
        String kelas = input.nextLine();

        System.out.print("Masukkan jurusan      : ");
        String jurusan = input.nextLine();

        System.out.print("Masukkan umur         : ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan : ");
        double tinggi = input.nextDouble();
        input.nextLine(); // bersihkan buffer

        System.out.print("Masukkan hobi         : ");
        String hobi = input.nextLine();

        System.out.print("Masukkan grade        : ");
        char grade = input.next().charAt(0);
        
        System.out.println("\n========== BIODATA MAHASISWA ==========");
        System.out.printf("%-18s    : %s%n", "Nama Lengkap", nama);
        System.out.printf("%-18s    : %s%n", "NIM", nim);
        System.out.printf("%-18s    : %s%n", "Kelas", kelas);
        System.out.printf("%-18s    : %s%n", "Jurusan", jurusan);
        System.out.printf("%-18s    : %d tahun%n", "Umur", umur);
        System.out.printf("%-18s    : %.2f cm%n", "Tinggi Badan", tinggi);
        System.out.printf("%-18s    : %s%n", "Hobi", hobi);
        System.out.printf("%-18s    : %c%n", "Grade", grade);
        System.out.println("=========================================");
        input.close();
    }
}
