// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Pertemuan 9 : Koleksi - Kelas Anjing

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bunyikan() {
        System.out.println(nama + " (Anjing) berbunyi: Guk-Guk!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " (Anjing) bergerak dengan melata.");
    }
}
