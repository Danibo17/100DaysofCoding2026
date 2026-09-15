import java.util.Scanner;
public class Day14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("=== DATA TABUNGAN ===");
        System.out.print("Tabungan awal : ");
        int tabunganAwal = input.nextInt();

        System.out.print("Uang masuk : ");
        int uangMasuk = input.nextInt();

        System.out.print("Uang diambil : ");
        int uangDiambil = input.nextInt();

        int total = tabunganAwal + uangMasuk;
        int tabunganAkhir = total - uangDiambil;

        System.out.print("Tabungan awal " + tabunganAwal);
        System.out.print("Uang masuk " + uangMasuk);
        System.out.print("Uang diambil " + uangDiambil);

        System.out.print("Jumlah tabungan : " + tabunganAkhir);

    
    }
}
