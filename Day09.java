public class day09 {
    public static void main(String[] args) {
        // Deklarasi konstanta, nilai tetap yang tidak dapat diubah
        final double HARGA = 15000;
        final double DISKON = 0.10; // 10%
        // Menghitung potongan dan harga akhir
        double potongan = HARGA * DISKON;
        double hargaAkhir = Harga - potongan;
        // Hasil
        System.out.println("Harga Awal : Rp" + HARGA);
        System.out.println("Diskon 10% : Rp" + potongan);
        System.out.println("Harga Akhir : Rp" + hargaAkhir);
    }
}
