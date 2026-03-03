/*  Nama File   : Dosen.java
    Deskripsi   : Berisi atribut dan method dalam class Dosen
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 3 Maret 2026
*/
public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    // Konstruktor tanpa parameter
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor (Getter)
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    // Mutator (Setter)
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
