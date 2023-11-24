import java.util.Scanner;

public class latihan7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("== Soal 1 ==");

        System.out.print("Nilai Awal   : ");
        int aw = in.nextInt();

        System.out.print("Nilai akhir  : ");
        int ak = in.nextInt();

        for (int i = aw; i <= ak; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("== Soal 2 ==");
        System.out.print("Nilai Awal   : ");
        int o = in.nextInt();

        System.out.print("Nilai akhir  : ");
        int p = in.nextInt();

        for (int i = o; i >= p; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
