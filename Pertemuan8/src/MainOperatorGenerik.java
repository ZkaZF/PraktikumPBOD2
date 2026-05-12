// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Pertemuan 8 : Generik pada Operator - Aplikasi OperatorGenerik

public class MainOperatorGenerik {
    public static void main(String[] args) {

        // b.1 Tukar sesama Integer
        Datum<Integer> angka1 = new Datum<>(3);
        Datum<Integer> angka2 = new Datum<>(6);

        System.out.println("=== Tukar Sesama Integer ===");
        System.out.println("Sebelum : a=" + angka1.getIsi() + ", b=" + angka2.getIsi());
        OperatorGenerik.tukar(angka1, angka2);
        System.out.println("Sesudah : a=" + angka1.getIsi() + ", b=" + angka2.getIsi());

        System.out.println();

        // b.2 Tukar sesama String
        Datum<String> kata1 = new Datum<>("Halo");
        Datum<String> kata2 = new Datum<>("Dunia");

        System.out.println("=== Tukar Sesama String ===");
        System.out.println("Sebelum : a=\"" + kata1.getIsi() + "\", b=\"" + kata2.getIsi() + "\"");
        OperatorGenerik.tukar(kata1, kata2);
        System.out.println("Sesudah : a=\"" + kata1.getIsi() + "\", b=\"" + kata2.getIsi() + "\"");

        System.out.println();

    
        // b.3 Tukar sesama keluarga Anabul
        //     Contoh 1: Anjing <-> Kucing  (bertipe Anabul)
        Datum<Anabul> hewan1 = new Datum<>(new Anjing("Rex"));
        Datum<Anabul> hewan2 = new Datum<>(new Kucing<>("Mochi", 3.5));

        System.out.println("=== Tukar Sesama Anabul (Anjing <-> Kucing) ===");
        System.out.println("Sebelum : a=" + hewan1.getIsi().getNama()
                         + " (" + hewan1.getIsi().getClass().getSimpleName() + ")"
                         + ", b=" + hewan2.getIsi().getNama()
                         + " (" + hewan2.getIsi().getClass().getSimpleName() + ")");
        OperatorGenerik.tukar(hewan1, hewan2);
        System.out.println("Sesudah : a=" + hewan1.getIsi().getNama()
                         + " (" + hewan1.getIsi().getClass().getSimpleName() + ")"
                         + ", b=" + hewan2.getIsi().getNama()
                         + " (" + hewan2.getIsi().getClass().getSimpleName() + ")");

        System.out.println();

        //     Contoh 2: Anggora <-> Kembangtelon
        Datum<Anabul> kucing1 = new Datum<>(new Anggora<>("Bella", 4.0, "Putih"));
        Datum<Anabul> kucing2 = new Datum<>(new Kembangtelon<>("Mimi", 3.2, "Hitam-Putih-Oranye"));

        System.out.println("=== Tukar Sesama Anabul (Anggora <-> Kembangtelon) ===");
        System.out.println("Sebelum : a=" + kucing1.getIsi().getNama()
                         + " (" + kucing1.getIsi().getClass().getSimpleName() + ")"
                         + ", b=" + kucing2.getIsi().getNama()
                         + " (" + kucing2.getIsi().getClass().getSimpleName() + ")");
        OperatorGenerik.tukar(kucing1, kucing2);
        System.out.println("Sesudah : a=" + kucing1.getIsi().getNama()
                         + " (" + kucing1.getIsi().getClass().getSimpleName() + ")"
                         + ", b=" + kucing2.getIsi().getNama()
                         + " (" + kucing2.getIsi().getClass().getSimpleName() + ")");

        System.out.println();

        // c. Fungsi generik Bobot2: jumlah bobot dua keturunan Kucing
        Kucing<Double>     kucingA  = new Kucing<>("Luna",  4.2);
        Anggora<Double>    anggoraA = new Anggora<>("Bella", 4.0, "Putih");
        Kembangtelon<Double> kbA    = new Kembangtelon<>("Mimi", 3.2, "Hitam-Putih-Oranye");

        System.out.println("=== Fungsi Bobot2 (Jumlah Bobot Dua Keturunan Kucing) ===");

        double total1 = OperatorGenerik.bobot2(kucingA, anggoraA);
        System.out.println("Bobot2(" + kucingA.getNama() + ", " + anggoraA.getNama() + ") = "
                         + kucingA.getBobot() + " + " + anggoraA.getBobot() + " = " + total1 + " kg");

        double total2 = OperatorGenerik.bobot2(anggoraA, kbA);
        System.out.println("Bobot2(" + anggoraA.getNama() + ", " + kbA.getNama() + ") = "
                         + anggoraA.getBobot() + " + " + kbA.getBobot() + " = " + total2 + " kg");

        double total3 = OperatorGenerik.bobot2(kucingA, kbA);
        System.out.println("Bobot2(" + kucingA.getNama() + ", " + kbA.getNama() + ") = "
                         + kucingA.getBobot() + " + " + kbA.getBobot() + " = " + total3 + " kg");
    }
}
