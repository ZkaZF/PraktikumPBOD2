// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Soal 3 : Polimorfisme Universal Inclusion - Anabul (Kelas Induk)
// Pertemuan 9 : ditambah atribut panggilan sesuai soal 2a

public abstract class Anabul {
    protected String nama;      // nama asli hewan
    protected String panggilan; // nama panggilan hewan (soal 2a)

    public Anabul(String nama) {
        this.nama = nama;
        this.panggilan = nama; // default panggilan = nama
    }

    // mengembalikan nama panggilan hewan (soal 2a)
    public String getNama() {
        return panggilan;
    }

    // mengubah nama panggilan hewan (soal 2a)
    public void setNama(String nama) {
        this.panggilan = nama;
    }

    // Method abstrak yang di-override oleh setiap kelas anak
    public abstract void bunyikan();

    public abstract void bergerak();
}
