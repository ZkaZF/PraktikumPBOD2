// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Soal 4a : Kelas induk CivitasAkademika

public abstract class CivitasAkademika {
    protected String nama;

    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Fungsi abstrak: setiap kelas anak menyesuaikan (NIM / NIP)
    public abstract String getNomor();
}
