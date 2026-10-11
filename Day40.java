import java.util.Scanner;

public class Day40 { 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah punya ktp? (true/false): ");
        boolean ktp = input.nextBoolean();

        if (umur >= 17 && ktp == true) {
            System.out.println("pendaftaran diterima! sudah cukup umur dan punya ktp");
        } else {
            System.out.print("pendaftaran ditolak! belum cukup umur dan tidak punya ktp");
        }

    }
}


import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("Ini adalah angka Positif.");
            if (angka % 2 == 0) {
                System.out.println("Angka ini bernilai Genap.");
            }else{
                System.out.println("Angka ini bernilai Ganjil.");
            }
        } else if (angka < 0){
            System.out.println("Ini adalah angka Negatif.");
        }else{
            System.out.println("Ini adalah angka Nol.");
        }
    }
}


import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MESIN KOPI OTOMATIS === ");
        System.out.println("1. Kopi hitam (Rp 5000)");
        System.out.println("2. Cappuccino (Rp 10000)");
        System.out.println("3. Teh manis (Rp 4000)");

        System.out.print("pilih nomor minuman: ");
        int nm = input.nextInt();

        if (nm == 1) {
            System.out.println("Anda memilih Kopi Hitam.\r\n"
                    + //
                    "Silakan masukkan uang sebesar Rp 5000.");

        } else if (nm == 2) {
            System.out.println("Anda memilih Cappuccino.\r\n"
                    + //
                    "Silakan masukkan uang sebesar Rp 10000.");
        } else if (nm == 3) {
            System.out.println("Anda memilih Teh Manis.\r\n"
                    + //
                    "Silakan masukkan uang sebesar Rp 4000.");
        } else {
            System.out.println("Pilihan tidak valid! Minuman tidak ditemukan.");
        }

    }
}


import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat emas: ");
        double berat = input.nextDouble();

        if (berat % 1 != 0) {
            System.out.print("angka desimal(emas digital)");
        } else {
            System.out.print("angka bulat(emas fisik): ");
        }
    }
}


import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas bawah: ");
        int bW = input.nextInt();

        System.out.print("Masukkan batas atas: ");
        int bA = input.nextInt();

        System.out.print("Masukkan angka target: ");
        int aT = input.nextInt();

        if (aT >= bW && aT <= bA) {
            System.out.print("Status: Di dalam range");
        } else {
            System.out.print("Status: Di luar range");
        }
    }
}


import java.util.Scanner;

public class Soal6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan HP: ");
        int hp = input.nextInt();

        System.out.print("Masukkan Damage: ");
        int damage = input.nextInt();

        System.out.print("Menang? (true/false): ");
        boolean menang = input.nextBoolean();

        int level = 1;

        if (menang == true) {
            level++;
        } else {
            hp -= damage;
            level--;
        }
        System.out.println("Level " + level);
        System.out.println("HP " + hp);

    }
}


import java.util.Scanner;

public class Soal7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo = 100000;

        System.out.println("=== MENU ATM ===");
        System.out.println("1. Setor uang: ");
        System.out.println("2. Tarik uang: ");
        System.out.print("Pilih menu (1/2): ");

        int menu = input.nextInt();
        int nominal = 0;
        if (menu == 1) {
            System.out.print("Masukkan nominal: ");
            nominal = input.nextInt();
            saldo += nominal;
            System.out.println("Setor berhasil. Saldo Anda: Rp " + saldo);

        } else if (menu == 2) {
            System.out.print("Masukkan nominal: ");
            nominal = input.nextInt();
            if (nominal > saldo) {
                System.out.println("Maaf, saldo tidak cukup!\nSaldo Anda Rp: " + saldo);
            } else {
                saldo -= nominal;
                System.out.println("Tarik tunai berhasil. Saldo Anda: Rp " + saldo);
                }

        } else {
            System.out.println("Error: Menu tidak valid. Transaksi dibatalkan.");
        }

    }
}
