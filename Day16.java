import java.util.Scanner;
public class Day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah permen");
        int jumlahPermen = input.nextInt();

        System.out.print("Jumlah siswa");
        int jumlahSiswa = input.nextInt();

        int permenSetiapSiswa = jumlahPermen / jumlahSiswa;
        int sisaPermen = jumlahPermen % jumlahSiswa;
        System.out.print("Jumlah permen " + jumlahPermen);
        System.out.print("jumlah siswa " + jumlahSiswa);

        System.out.println("Permen Setiap Siswa : " permenSetiapSiswa);
        System.out.println("Sisa Permen : " sisaPermen);


    }
}
