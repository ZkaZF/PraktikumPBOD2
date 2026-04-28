// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Soal 4a, 4i, 4j : Kelas MahasiswaSeminar (anak dari CivitasAkademika)

public class MahasiswaSeminar extends CivitasAkademika {
    private String NIM;
    private Dosen dosenwali; // Soal 4i

    public MahasiswaSeminar(String NIM, String nama) {
        super(nama);
        this.NIM = NIM;
        this.dosenwali = null;
    }

    public String getNIM() {
        return NIM;
    }

    // Implementasi getNomor() -> mengembalikan NIM
    @Override
    public String getNomor() {
        return NIM;
    }

    // -------------------------------------------------------
    // i. Prosedur setWali: mengubah dosenwali dengan parameter Dosen
    // -------------------------------------------------------
    public void setWali(Dosen dosen) {
        this.dosenwali = dosen;
    }

    public Dosen getDosenwali() {
        return dosenwali;
    }

    // -------------------------------------------------------
    // j. Prosedur tampilDataMahasiswa: NIM, Nama, Nama Dosenwali
    // -------------------------------------------------------
    public void tampilDataMahasiswa() {
        System.out.println("NIM          : " + NIM);
        System.out.println("Nama         : " + nama);
        if (dosenwali != null) {
            System.out.println("Dosen Wali   : " + dosenwali.getNama());
        } else {
            System.out.println("Dosen Wali   : (belum ditetapkan)");
        }
    }

    @Override
    public String toString() {
        return "Mahasiswa [NIM=" + NIM + ", Nama=" + nama + "]";
    }
}
