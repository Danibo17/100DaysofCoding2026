public class Day11 {
    public static void main(String[] args) {
        // === DATA BIODATA === 
        String nama = "Rahmadani";
        String nim = "D0226003";
        int umur = 19;
        double tinggi = 154.5;
        char grade = 'A';

        // === TAMPIL RAPI DENGAN printf() ===
        System.out.println("==============================");
        System.out.println("  DATA BIODATA MAHASISWA  ");
        System.out.println("==============================");
        System.out.printf("%-15s : %s%n", "Nama Lengkap", nama);
        System.out.printf("%-15s : %s%n", "NIM", nim);
        System.out.printf("%-15s : %d tahun%n", "Umur", umur);
        System.out.printf("%-15s : %.1f cm%n", "Tinggi Badan", tinggi);
        System.out.printf("%-15s : %c%n", "Grade", grade);
        System.out.println("==============================");
