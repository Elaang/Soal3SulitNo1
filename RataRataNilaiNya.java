package Sekolah.UKL;
import java.util.Scanner;

public class RataRataNilaiNya {
    public static void main(String[] args) {
        int jumlahSiswa = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah siswanya apakah default seperti biasa (36) atau mau input manual?");
        System.out.println("Jawab dengan 'default' / 'manual'");
        String pilihan = input.nextLine();
        if (pilihan.equalsIgnoreCase("manual")) {
            System.out.print("Masukkan jumlah siswa: ");
            jumlahSiswa = input.nextInt();
        } else if (pilihan.equalsIgnoreCase("default")) {
            jumlahSiswa = 36;
        } else {
            System.out.println("Something wrong with YOU sir. Goodbye.");
                input.close();
            return;
        }
        double[] nilaiSiswa = new double[jumlahSiswa];
        int totalNilai = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = input.nextDouble();
            totalNilai += nilaiSiswa[i];
        }
        double rataRata =  totalNilai / jumlahSiswa;
        System.out.printf("Rata-rata nilai siswa adalah: " + rataRata);
        input.close();
    }
}
