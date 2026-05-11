// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Pertemuan 8 : Larik Generik - Aplikasi Kelas Data

public class MainData {
    public static void main(String[] args) {

        // -------------------------------------------------------
        // a. Aplikasi Data dengan tipe dasar (Integer & String)
        // -------------------------------------------------------
        Data<Integer> dataAngka = new Data<>();
        dataAngka.setIsi(1, 10);
        dataAngka.setIsi(2, 20);
        dataAngka.setIsi(3, 30);

        System.out.println("=== Data<Integer> ===");
        System.out.println("Elemen posisi 1 : " + dataAngka.getIsi(1));
        System.out.println("Elemen posisi 2 : " + dataAngka.getIsi(2));
        System.out.println("Elemen posisi 3 : " + dataAngka.getIsi(3));
        System.out.println("Jumlah elemen   : " + dataAngka.getSize());

        System.out.println();

        // -------------------------------------------------------
        // b. Prosedur setIsi — mengisi Data dengan keluarga Anabul
        // -------------------------------------------------------
        Data<Anabul> dataAnabul = new Data<>();

        dataAnabul.setIsi(1, new Kucing<>("Mochi",    3.5));
        dataAnabul.setIsi(2, new Anjing("Rex"));
        dataAnabul.setIsi(3, new Burung("Tweety"));
        dataAnabul.setIsi(4, new Anggora<>("Bella",   4.0, "Putih"));
        dataAnabul.setIsi(5, new Kembangtelon<>("Mimi", 3.2, "Hitam-Putih-Oranye"));
        dataAnabul.setIsi(6, new Anggora<>("Snow",    3.8, "Abu-abu"));
        dataAnabul.setIsi(7, new Anjing("Bingo"));

        System.out.println("=== b. setIsi — Mengisi Data<Anabul> ===");
        System.out.println("7 Anabul berhasil ditambahkan ke dalam Data.");

        // Uji posisi tidak valid
        System.out.println("\nUji posisi tidak valid (0 dan 101):");
        dataAnabul.setIsi(0,   new Anjing("Error1"));
        dataAnabul.setIsi(101, new Anjing("Error2"));

        System.out.println();

        // -------------------------------------------------------
        // c. Fungsi getIsi — mengambil elemen Anabul berdasar posisi
        // -------------------------------------------------------
        System.out.println("=== c. getIsi — Mengambil Elemen Anabul ===");
        for (int i = 1; i <= 7; i++) {
            Anabul a = dataAnabul.getIsi(i);
            System.out.println("Posisi " + i + " : "
                    + a.getNama()
                    + " (" + a.getClass().getSimpleName() + ")");
        }

        System.out.println("\nDemo bunyi & gerak tiap Anabul:");
        for (int i = 1; i <= 7; i++) {
            Anabul a = dataAnabul.getIsi(i);
            a.bunyikan();
            a.bergerak();
            System.out.println();
        }

        // -------------------------------------------------------
        // d. Fungsi getSize — jumlah elemen efektif
        // -------------------------------------------------------
        System.out.println("=== d. getSize — Jumlah Elemen Efektif ===");
        System.out.println("Jumlah Anabul dalam Data : " + dataAnabul.getSize());

        // Tambah lagi dan cek size
        dataAnabul.setIsi(8, new Kucing<>("Luna", 4.2));
        dataAnabul.setIsi(9, new Burung("Rio"));
        System.out.println("Setelah tambah 2 elemen  : " + dataAnabul.getSize());

        // Timpa posisi yang sudah ada (size tidak berubah)
        dataAnabul.setIsi(1, new Anjing("Bulldog"));
        System.out.println("Setelah timpa posisi 1   : " + dataAnabul.getSize()
                + " (tidak berubah, posisi 1 sudah terisi)");
    }
}
