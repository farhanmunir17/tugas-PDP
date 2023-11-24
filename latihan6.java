import java.util.Scanner;

class latihan6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==soal 1==");

        // for
        System.out.print("Masukan kata yang ingin anda ulangi :");
        String kata1 = input.nextLine();
        System.out.print(" Berapa kali pengulangan :");
        int o = input.nextInt();

        for (int k = 1; k <= o; k++) {
            System.out.println(kata1);
        }
        // while
        int i = 1;
        System.out.println("Masukan kata yang ingin anda ulangi:");
        String kata2 = input.nextLine();
        System.out.print("Berapa kali pengulangan :");
        int n = input.nextInt();

        while (i <= n) {
            System.out.println(kata2);
            i++;
        }
        // do while
        int j = 1;
        System.out.println("Masukan kata yang ingin anda ulangi:");
        String kata3 = input.nextLine();
        System.out.print("Berapa kali pengulangan :");
        int m = input.nextInt();

        System.out.println("==soal 2==");
        do {
            j++;
            System.out.println(kata3);
        } while (j <= m);

        // pengulangan for
        System.out.print("Sampai angka berapa bilangan ganjil ditampilkan? :");
        int e = input.nextInt();

        for (int q = 1; q <= e; q += 2) {
            System.out.println(q);
        }

        // pengulangan while
        System.out.print("Sampai angka berapa bilangan ganjil ditampilkan? :");
        int p = input.nextInt();
        int f = 1;
        while (f <= p) {
            System.out.println(f);
            f += 2;
        }

        // pengulangan do
        System.out.print("Sampai angka berapa bilangan ganjil ditampilkan? :");
        int s = input.nextInt();
        int k = 1;
        do {
            System.out.println(k);
            k += 2;
        } while (k <= s);

        System.out.println("==soal 3==");
        System.out.println("===Program rata rata nilai Mahasiswa===");

        // jumlah matkul
        System.out.println("Masukkan jumlah matkul : 3");

        // matkul 1
        System.out.print("Nilai Matkul 1 :");
        int matkul1 = input.nextInt();

        // matkul 2
        System.out.print("Nilai Matkul 2 :");
        int matkul2 = input.nextInt();

        // matkul 3
        System.out.print("Nilai Matkul 3 :");
        int matkul3 = input.nextInt();

        double rata2 = (matkul1 + matkul2 + matkul3) / 3;
        System.out.println("Rata rata nilai : " + rata2);

    }
}