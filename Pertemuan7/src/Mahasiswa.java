// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Soal 2 : Polimorfisme Ad Hoc Overloading - Kelas Mahasiswa

public class Mahasiswa {

    // Atribut
    private int NIM;
    private String Nama;
    private String Programstudi;

    // -------------------------------------------------------
    // c. Konstruktor tanpa parameter: NIM=-999, Nama="n/a", Programstudi="n/a"
    // -------------------------------------------------------
    public Mahasiswa() {
        this.NIM = -999;
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    // -------------------------------------------------------
    // d. Konstruktor dengan tiga parameter
    // -------------------------------------------------------
    public Mahasiswa(int NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // -------------------------------------------------------
    // e. Konstruktor copy (kloning) dari objek Mahasiswa lain
    // -------------------------------------------------------
    public Mahasiswa(Mahasiswa lain) {
        this.NIM = lain.NIM;
        this.Nama = lain.Nama;
        this.Programstudi = lain.Programstudi;
    }

    // -------------------------------------------------------
    // Getter & Setter dasar
    // -------------------------------------------------------
    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getProgramstudi() {
        return Programstudi;
    }

    // -------------------------------------------------------
    // b. Overloading setProgramStudi - 3 varian
    // -------------------------------------------------------

    // Varian 1: tanpa parameter -> Programstudi = "Kosong"
    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    // Varian 2: satu parameter String -> Programstudi = nilai input
    public void setProgramStudi(String ps) {
        this.Programstudi = ps;
    }

    // Varian 3: satu parameter objek Mahasiswa lain -> salin Programstudi-nya
    public void setProgramStudi(Mahasiswa lain) {
        this.Programstudi = lain.Programstudi;
    }

    // Tampilkan data mahasiswa
    public void tampilData() {
        System.out.println("NIM          : " + NIM);
        System.out.println("Nama         : " + Nama);
        System.out.println("Programstudi : " + Programstudi);
    }

    // -------------------------------------------------------
    // Main: demonstrasi semua fitur
    // -------------------------------------------------------
    public static void main(String[] args) {

        // c. Konstruktor default
        System.out.println("=== (c) Konstruktor default ===");
        Mahasiswa mDefault = new Mahasiswa();
        mDefault.tampilData();

        // d. Konstruktor dengan tiga parameter
        System.out.println("\n=== (d) Konstruktor tiga parameter ===");
        Mahasiswa mLengkap = new Mahasiswa(24060100, "Budi Santoso", "Informatika");
        mLengkap.tampilData();

        // e. Konstruktor kloning
        System.out.println("\n=== (e) Konstruktor kloning ===");
        Mahasiswa mKloning = new Mahasiswa(mLengkap);
        mKloning.tampilData();

        // b. Overloading setProgramStudi
        System.out.println("\n=== (b) Overloading setProgramStudi ===");

        // Varian 1: tanpa parameter
        System.out.println("-- Varian 1: tanpa parameter --");
        Mahasiswa m1 = new Mahasiswa(11111111, "Andi", "Teknik Elektro");
        m1.setProgramStudi();
        m1.tampilData();

        // Varian 2: satu parameter String
        System.out.println("-- Varian 2: satu parameter String --");
        Mahasiswa m2 = new Mahasiswa(22222222, "Siti", "Teknik Sipil");
        m2.setProgramStudi("Ilmu Komputer");
        m2.tampilData();

        // Varian 3: satu parameter objek Mahasiswa lain
        System.out.println("-- Varian 3: satu parameter Mahasiswa lain --");
        Mahasiswa mRef = new Mahasiswa(99999999, "Referensi", "Sistem Informasi");
        Mahasiswa m3 = new Mahasiswa(33333333, "Doni", "Teknik Kimia");
        m3.setProgramStudi(mRef);
        m3.tampilData();
    }
}
