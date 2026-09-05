public class day04 {
    public static void main(String[] args) {
        // ========== 1. TIPE DATA BYTE ==========
        // Tipe data ini ukurannya paling kecil diantara tipe data bulat lainnya,
        // hanya memiliki 1 byte memori. Angka yang bisa dimasukkan juga terbatas,
        // yaitu dari angka 128 sampai 127. Biasanya dipakai untuk,
        // angka yang pastinya kecil dan tidak akan berubah jadi besar,
        // contohnya seperti nilai umur, nilai dalam skala kecil atau angka sederhana lainnya.
        byte umur = 17;
        System.out.println("Nilai byte (umur) : " + 17);

        // ========== 2. TIPE DATA short ==========
        // Tipe data ini lebih besar sedikit dari byte, memakai 2 byte memori
        // Angka yang bisa ditampung berkisar dari 32.768 sampai 32.767
        // Cocok dipakai untuk angka yang lebih besar dari byte,
        // contohnya seperti tahun, jumlah barang dalam jumlah sedang, atau kode sederhana.
        short tahunMasuk = 2026;
        System.out.println("Nilai short (tahun) : " + 2026);

        // ========== 3. TIPE DATA int ==========
        // Ini adalah tipe data yang paling sering dan paling banyak dipakai dalam pemrogeraman Java.
        // Memakai 4 byte memori, dan bisa menampung angka dari 2.147.483.684 sampai 2.147.483.647.
        // hampir semua angka biasa yang kita pakai sehari hari muat disini,
        // jadi kalau bingung mau pakai yang mana, pilih int saja sudah cukup
        // Contoh pemakaian: NIM, nomor hp, jumlah mahasiswa dan angka lainnya.
        // int nimMahasiswa = "022603";

        System.out.println("Nilai int (NIM) : " + nimMahasiswa);
        // ========== 4. TIPE DATA long ==========
        // Tipe data ini yang paling besar ukurannya memakai 8 byte memori.
        // Dipakai hanya kalau angkanya sudah besar dan tidak muat di int.
        // Rentang angkanya sangat besar sekali, bisa sampai miliaran bahkan triliunan.
        // Contoh pemakaian: jumlah penduduk, uang dalam jumlah sangat besar, atau nomor yang sangat panjang.
        long jumlahPenduduk = 280000000L;
        System.out.println("Nilai long (uang) : " + jumlahPenduduk);
    }
}
