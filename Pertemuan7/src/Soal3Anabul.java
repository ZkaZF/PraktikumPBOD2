// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Soal 3 : Polimorfisme Universal Inclusion - Main Class

public class Soal3Anabul {
    public static void main(String[] args) {
        // Buat array polimorfik bertipe Anabul
        Anabul[] daftarAnabul = {
                new Kucing("Mochi"),
                new Anjing("Rex"),
                new Burung("Tweety"),
                new Kucing("Luna"),
                new Anjing("Bingo")
        };

        System.out.println("=== Simulasi Bunyi dan Gerakan Anabul ===\n");

        for (Anabul a : daftarAnabul) {
            a.bunyikan();
            a.bergerak();
            System.out.println();
        }
    }
}
