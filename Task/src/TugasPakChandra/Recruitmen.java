package TugasPakChandra;
import java.util.Scanner;
public class Recruitmen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai tes akademik: ");
        int nilaiAkademik = input.nextInt();

        System.out.print("Masukkan nilai tes ketrampilan: ");
        int nilaiKetrampilan = input.nextInt();

        System.out.print("Masukkan nilai tes psikologi: ");
        int nilaiPsikologi = input.nextInt();

        double rataRata = (nilaiAkademik + nilaiKetrampilan + nilaiPsikologi) / 3.0;

        if (rataRata >= 75) {
            System.out.println("Diterima");

            if (nilaiAkademik > nilaiKetrampilan || nilaiAkademik > nilaiPsikologi) {
                System.out.println("Ditempatkan di bagian administrasi");
            } else if (nilaiKetrampilan > nilaiAkademik && nilaiKetrampilan > nilaiPsikologi) {
                System.out.println("Ditempatkan di bagian produksi");
            } else {
                System.out.println("Ditempatkan di bagian pemasaran");
            }
            } else {
            System.out.println("Tidak diterima");
        }
    }
}

    

