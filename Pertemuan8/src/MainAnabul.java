// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Pertemuan 8 : Generik pada Class - Main Class

public class MainAnabul {
    public static void main(String[] args) {
        // Kucing biasa dengan tipe generik Double untuk bobot
        Kucing<Double> kucing1 = new Kucing<>("Mochi", 3.5);

        // Anak dari Kucing: Anggora dan Kembangtelon
        Anggora<Double> anggora1  = new Anggora<>("Bella", 4.0, "Putih");
        Anggora<Double> anggora2  = new Anggora<>("Snow", 3.8, "Abu-abu");
        Kembangtelon<Double> kb1  = new Kembangtelon<>("Mimi", 3.2, "Hitam-Putih-Oranye");
        Kembangtelon<Double> kb2  = new Kembangtelon<>("Cici", 2.9, "Hitam-Kuning-Putih");

        // --- Demo Generik: bobot ---
        System.out.println("=== Data Kucing & Anak Jenisnya ===");
        System.out.println(kucing1);
        System.out.println(anggora1);
        System.out.println(anggora2);
        System.out.println(kb1);
        System.out.println(kb2);

        System.out.println();

        // --- Polimorfisme: array bertipe Anabul ---
        Anjing anjing1 = new Anjing("Rex");
        Burung burung1 = new Burung("Tweety");

        Anabul[] daftarAnabul = { kucing1, anggora1, kb1, anjing1, burung1 };

        System.out.println("=== Simulasi Bunyi dan Gerakan Anabul ===\n");
        for (Anabul a : daftarAnabul) {
            a.bunyikan();
            a.bergerak();
            System.out.println();
        }
    }
}
