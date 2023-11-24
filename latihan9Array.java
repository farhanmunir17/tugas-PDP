import java.util.Scanner;

public class latihan9Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("== OPEN TRIP RINJANI ==");

        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = input.nextInt();
        String[] namaPeserta = new String[jumlahPeserta];
        String[] ttlPeserta = new String[jumlahPeserta];
        int[] usiaPeserta = new int[jumlahPeserta];
        String[] jenisKelPeserta = new String[jumlahPeserta];
        int[] noHpPeserta = new int[jumlahPeserta];

        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.print("Nama Peserta ke-" + (i + 1) + ": ");
            namaPeserta[i] = input.next();

            System.out.print("Tempat, Tanggal lahir Peserta ke-" + (i + 1) + ": ");
            ttlPeserta[i] = input.next();
            System.out.println();

            System.out.print("Usia Peserta ke-" + (i + 1) + ": ");
            usiaPeserta[i] = input.nextInt();

            System.out.print("Jenis Kelamin Peserta ke-" + (i + 1) + ": ");
            jenisKelPeserta[i] = input.next();

            System.out.print("No Hp Peserta ke-" + (i + 1) + ": ");
            noHpPeserta[i] = input.nextInt();

        }

        System.out.println("\n=== Data Peserta ===");
        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.println("Nama: " + namaPeserta[i]);
            System.out.println("TTL : " + ttlPeserta[i]);
            System.out.println("Usia: " + usiaPeserta[i]);
            if (usiaPeserta[i] > 15) {
                System.out.println("DEWASA");
            } else {
                System.out.println("Anak-Anak");
            }
            System.out.println("Jenis Kelamin: " + jenisKelPeserta[i]);
            System.out.println("NO Hp: " + noHpPeserta[i]);
            System.out.println("======================");
        }
    }
}
