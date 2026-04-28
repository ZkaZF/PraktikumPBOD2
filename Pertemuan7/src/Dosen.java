// NIM    : [NIM_ANDA]
// Nama   : [NAMA_ANDA]
// Tanggal: 2026-04-28
// Soal 4a : Kelas Dosen (anak dari CivitasAkademika)

public class Dosen extends CivitasAkademika {
    private String NIP;

    public Dosen(String NIP, String nama) {
        super(nama);
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    // Implementasi getNomor() -> mengembalikan NIP
    @Override
    public String getNomor() {
        return NIP;
    }

    @Override
    public String toString() {
        return "Dosen [NIP=" + NIP + ", Nama=" + nama + "]";
    }
}
