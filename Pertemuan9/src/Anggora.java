// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Pertemuan 9 : Koleksi - Kelas Anggora (anak dari Kucing)

public class Anggora<T> extends Kucing<T> {
    private String warnaBulu; // atribut khusus ras Anggora

    public Anggora(String nama, T bobot, String warnaBulu) {
        super(nama, bobot);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void bunyikan() {
        System.out.println(nama + " (Anggora) berbunyi: Purrr... Meong!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " (Anggora) bergerak dengan anggun dan pelan.");
    }

    @Override
    public String toString() {
        return "Anggora{nama='" + nama + "', bobot=" + getBobot() + " kg, warnaBulu='" + warnaBulu + "'}";
    }
}
