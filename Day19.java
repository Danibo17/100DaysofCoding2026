public class Day19 {
    public static void main(String[] args) {
        // Nilai awal
        double angka = 150.75;

        // Konversi bertahap DARI BESAR KE KECIL pakai CASTING
        double nilaiDouble = angka;
        float nilaiFloat = (float) nilaiDouble;
        long nilaiLong = (long) nilaifloat;
        int nilaiInt = (int) nilaiLong;
        short nilaiShort = (short) nilaiInt;
        byte nilaiByte = (byte) nilaiShort;

        // Tampilkan semua hasil
        System.out.println("Double : " + nilaiDouble);
        System.out.println("Float : " + nilaiFloat);
        System.out.println("Long : " + nilaiLong);
        System.out.println("Int : " + nilaiInt);
        System.out.println("Short : " + nilaiShort);
        System.out.println("Byte : " + nilaiByte);



    }
}
