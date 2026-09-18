import java.util.Scanner;
public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // minta data dari pengguna
        System.out.print("Masukkan point awal pelanggan : ");
        int point = input.nextInt();

        System.out.print("Masukkan point transaksi baru : ");
        int tambah = input.nextInt();

        System.out.print("Masukkan point yang ditukarkan");
        int kurangi = input.nextInt();

        // proses perubahan poin
        System.out.println("\n--- RIWAYAT PERUBAHAN POINT---");
        System.out.println("Point awal : " + point);
        point += tambah; // tambah point
        System.out.println("Setelah tambah transaksi ( +" + tambah + ") : " + point);
        point *= 2; // promo kalikan 2
        System.out.println("Setelah promo Double Points (*=2): " + point);
        System.out.println("Point Akhir Pelanggan : " + point);

    }
}
