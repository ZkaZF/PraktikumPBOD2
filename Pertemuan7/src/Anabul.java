// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Soal 3 : Polimorfisme Universal Inclusion - Anabul (Kelas Induk)

public abstract class Anabul {
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
