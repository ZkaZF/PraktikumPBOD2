// NIM    : [NIM_ANDA]
// Nama   : [NAMA_ANDA]
// Tanggal: 2026-04-28
// Soal 3 : Polimorfisme Universal Inclusion - Anabul (Kucing, Anjing, Burung)

// -------------------------------------------------------
// Kelas induk: Anabul
// -------------------------------------------------------
abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Method abstrak yang di-override oleh setiap kelas anak
    public abstract void bunyikan();
    public abstract void bergerak();
}

// -------------------------------------------------------
// Kelas anak: Kucing
// -------------------------------------------------------
class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bunyikan() {
        System.out.println(nama + " (Kucing) berbunyi: Meong!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata.");
    }
}

// -------------------------------------------------------
// Kelas anak: Anjing
// -------------------------------------------------------
class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bunyikan() {
        System.out.println(nama + " (Anjing) berbunyi: Guk-Guk!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " (Anjing) bergerak dengan melata.");
    }
}

// -------------------------------------------------------
// Kelas anak: Burung
// -------------------------------------------------------
class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bunyikan() {
        System.out.println(nama + " (Burung) berbunyi: Cuit!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " (Burung) bergerak dengan terbang.");
    }
}

// -------------------------------------------------------
// Kelas utama: simulasi semua anabul
// -------------------------------------------------------
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
