// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Pertemuan 8 : Generik pada Class - Ilustrasi Datum dengan Keluarga Anabul

public class MainDatum {
    public static void main(String[] args) {

        // -------------------------------------------------------
        // 1. Datum berisi tipe primitif (wrapper)
        // -------------------------------------------------------
        Datum<Integer> datumAngka = new Datum<>(42);
        Datum<String>  datumTeks  = new Datum<>("Hewan Peliharaan");

        System.out.println("=== Datum Tipe Dasar ===");
        System.out.println("Isi datumAngka : " + datumAngka.getIsi());
        System.out.println("Isi datumTeks  : " + datumTeks.getIsi());

        // Ubah isi menggunakan setIsi
        datumAngka.setIsi(100);
        datumTeks.setIsi("Anabul Kesayangan");
        System.out.println("Setelah setIsi:");
        System.out.println("Isi datumAngka : " + datumAngka.getIsi());
        System.out.println("Isi datumTeks  : " + datumTeks.getIsi());

        System.out.println();

        // -------------------------------------------------------
        // 2. Datum berisi objek Anabul (polimorfisme + generik)
        // -------------------------------------------------------
        Kucing<Double>     kucing   = new Kucing<>("Mochi", 3.5);
        Anggora<Double>    anggora  = new Anggora<>("Bella", 4.0, "Putih");
        Kembangtelon<Double> kb     = new Kembangtelon<>("Mimi", 3.2, "Hitam-Putih-Oranye");
        Anjing             anjing   = new Anjing("Rex");
        Burung             burung   = new Burung("Tweety");

        // Datum yang menampung objek Anabul
        Datum<Anabul> datumAnabul = new Datum<>(kucing);

        System.out.println("=== Datum berisi Anabul ===");
        System.out.println("Isi awal  : " + datumAnabul.getIsi());
        datumAnabul.getIsi().bunyikan();
        datumAnabul.getIsi().bergerak();

        System.out.println();

        // Ganti isi Datum dengan Anabul lain
        System.out.println("--- Setelah setIsi (Anggora) ---");
        datumAnabul.setIsi(anggora);
        System.out.println("Isi baru  : " + datumAnabul.getIsi());
        datumAnabul.getIsi().bunyikan();
        datumAnabul.getIsi().bergerak();

        System.out.println();

        System.out.println("--- Setelah setIsi (Kembangtelon) ---");
        datumAnabul.setIsi(kb);
        System.out.println("Isi baru  : " + datumAnabul.getIsi());
        datumAnabul.getIsi().bunyikan();
        datumAnabul.getIsi().bergerak();

        System.out.println();

        System.out.println("--- Setelah setIsi (Anjing) ---");
        datumAnabul.setIsi(anjing);
        datumAnabul.getIsi().bunyikan();
        datumAnabul.getIsi().bergerak();

        System.out.println();

        System.out.println("--- Setelah setIsi (Burung) ---");
        datumAnabul.setIsi(burung);
        datumAnabul.getIsi().bunyikan();
        datumAnabul.getIsi().bergerak();

        System.out.println();

        // -------------------------------------------------------
        // 3. Datum bertipe spesifik Kucing<Double>
        // -------------------------------------------------------
        Datum<Kucing<Double>> datumKucing = new Datum<>(new Kucing<>("Luna", 4.2));

        System.out.println("=== Datum bertipe Kucing<Double> ===");
        System.out.println("Nama  : " + datumKucing.getIsi().getNama());
        System.out.println("Bobot : " + datumKucing.getIsi().getBobot() + " kg");

        // Ganti dengan Kucing baru
        datumKucing.setIsi(new Anggora<>("Snow", 3.8, "Abu-abu"));
        System.out.println("Setelah setIsi (Anggora extends Kucing):");
        System.out.println("Nama  : " + datumKucing.getIsi().getNama());
        System.out.println("Bobot : " + datumKucing.getIsi().getBobot() + " kg");
    }
}
