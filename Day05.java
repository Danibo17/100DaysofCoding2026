public class day05 {
    public static void main(String[] args) {

        // 1. Masukkan nilai 
        double nilaiTugas = 85.5;
        double nilaiUTS = 80.0;
        double nilaiUAS = 90.5;

        // 2. Kemudian jumlahkan semua
        double jumlah = nilaiTugas = nilaiUTS = nilaiUAS;

        // 3. Kemudian dibagi untuk mendapatkan rata-rata
        double rataRata = jumlah / 3;

        // 4. Lalu tampilkan hasil
        System.out.println("=============================");
        System.out.println("       NILAI MAHASISWA"       );
        System.out.println("=============================");
        System.out.println();
        System.out.println("Nilai Tugas     : " + nilaiTugas);
        System.out.println("Nilai UTS       : " + nilaiUTS);
        System.out.println("Nilai UAS       : " + nilaiUAS);
        System.out.println();
        System.out.println("Rata-rata       : " + rataRata);
    }
}
