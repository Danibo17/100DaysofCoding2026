import java.util.Scanner;
public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        // === INPUT DATA ===
        System.out.print("Masukkan Username\t: ");
        String username = input.nextLine();
        System.out.print("Masukkan Umur\t\t: ");
        byte umur = input.nextByte();

        System.out.print("Masukkan Tinggi Badan\t\t: ");
        double tinggi = input.nextDouble();
        System.out.print("Masukkan Gol.darah\t\t: ");
        char golDarah = input.next().charAt(0);
        System.out.print("Apakah Akun Privat?\t: ");
        boolean status = input.nextBoolean();
        // ===== TAMPILKAN PROFIL =====
        System.out.println("\n=== PROFIL FACEGRAM ===");
        System.out.println("Username\t: " + username);
        System.out.println("Umur\t\t: " + umur + " Tahun");
        System.out.println("Tinggi Badan\t: " + tinggi + " cm");
        System.out.println("Gol. Darah\t: " + golDarah);
        System.out.println("Akun Privat\t: " + status);
        System.out.println("==========================");
    }
}


public class KasirKantin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String NAMA_KANTIN = "KANTIN KEJUJURAN TI";
        System.out.print("Nama Makanan\t: ");
        String namaMakanan = input.nextLine();
        System.out.print("Harga Satuan\t: ");
        int harga = input.nextLine();
        System.out.print("Jumlah Porsi\t ");
        int jumlah = input.nextLine();

        int total = harga * jumlah;
        // === TAMPILKAN STRUK ===
        System.out.println("\n===========================");
        System.out.println("\t" + NAMA_KANTIN);
        System.out.println("Makanan\t\t: " + namaMakanan);
        System.out.println("Harga Satuan\t: Rp " + harga);
        System.out.println("Jumlah Porsi\t: " + jumlah);
        System.out.println("-----------------------------");
        System.out.println("TOTAL BAYAR\t: Rp " + total);
        System.out.println("-----------------------------");
    }
}


public class Day12 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // === INPUT ===
    System.out.print("Masukkan Nama Mahasiswa\t: ");
    String nama = input.nextLine();
    System.out.print("Masukkan Nilai Ujian\t: ");
    double nilai = input.nextDouble();

    System.out.println("Data diterima: " + nama + " mendapat nilai " + nilai);
    nilai = 0.0;
    System.out.println("AWAS! SISTEM DIRETAS!");
    System.out.println("Nilai akhir " + nama + " sekarang diubah menjadi: " + nilai);
}
}


