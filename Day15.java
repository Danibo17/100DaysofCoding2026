import java.util.Scanner;
public class Day15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harga barang");
        int hargaBarang = input.nextInt();

        System.out.print("Jumlah barang");
        int jumlahBarang = input.nextInt();

        System.out.print("Jumlah orang");
        int jumlahOrang = input.nextInt();

        int totalHarga = hargaBarang * jumlahBarang;
        int hargaPerOrang = totalHarga / jumlahOrang;

        System.out.print("Harga barang " + hargaBarang);
        System.out.print("Jumlah barang " + jumlahBarang);
        System.out.print("Jumlah orang " + jumlahOrang);

    }
}
