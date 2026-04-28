// NIM    : [NIM_ANDA]
// Nama   : [NAMA_ANDA]
// Tanggal: 2026-04-28
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
