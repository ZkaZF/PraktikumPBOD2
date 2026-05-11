// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh

public class Kucing<T> extends Anabul {
    private T bobot; // atribut bobot dengan tipe generik (misal Double/Integer)

    public Kucing(String nama, T bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public T getBobot() {
        return bobot;
    }

    public void setBobot(T bobot) {
        this.bobot = bobot;
    }

    @Override
    public void bunyikan() {
        System.out.println(nama + " (Kucing) berbunyi: Meong!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata.");
    }

    @Override
    public String toString() {
        return "Kucing{nama='" + nama + "', bobot=" + bobot + " kg}";
    }
}
