// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Pertemuan 8 : Generik pada Class - Kelas Kembangtelon (anak dari Kucing)

public class Kembangtelon<T> extends Kucing<T> {
    private String corakBulu; // atribut khusus ras Kembangtelon (tricolor)

    public Kembangtelon(String nama, T bobot, String corakBulu) {
        super(nama, bobot);
        this.corakBulu = corakBulu;
    }

    public String getCorakBulu() {
        return corakBulu;
    }

    public void setCorakBulu(String corakBulu) {
        this.corakBulu = corakBulu;
    }

    @Override
    public void bunyikan() {
        System.out.println(nama + " (Kembangtelon) berbunyi: Meong! Meong!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " (Kembangtelon) bergerak dengan lincah.");
    }

    @Override
    public String toString() {
        return "Kembangtelon{nama='" + nama + "', bobot=" + getBobot() + " kg, corakBulu='" + corakBulu + "'}";
    }
}
