// class Lamp {
//         boolean isOn;

//         void turnOn() {
//             isOn = true;
//             System.out.println("Light on?" + isOn);
//         }

//         void turnOff() {
//             isOn = false;
//             System.out.println("Light on?" + isOn);
//         }
//     }
//     class latihan12 {
//     public static void main(String[] args) {

//         Lamp led = new Lamp();
//         Lamp halogen = new Lamp();

//         led.turnOn();
//         halogen.turnOff();
//     }
// }

// public class latihan12 {
// String warna = "Merah";
// String merk = "TOYOTA";

// void maju() {
// System.out.println("Mobil " + merk + " Dengan Warna " + warna + " Bergerak Maju");
// }

// void mundur() {
// System.out.println("Mobil " + merk + " Dengan Warna " + warna + " Bergerak Mundur");
// }

// public static void main(String[] args) {
// latihan12 mobilSaya = new latihan12();

// mobilSaya.maju();
// mobilSaya.mundur();
// }
// }

public class latihan12 {

    String makan = "rumput";
    String jenis = "perah";

    void jalan() {
        System.out.println("Sapi " + jenis + " sedang makan " + makan + " dan ia hendak jalan");
    }

    void lari() {
        System.out.println("Sapi " + jenis + " sedang makan " + makan + " dan ia hendak lari");
    }

    public static void main(String[] args) {
        latihan12 sapiPerah = new latihan12();

        sapiPerah.jalan();
        sapiPerah.lari();
    }
}