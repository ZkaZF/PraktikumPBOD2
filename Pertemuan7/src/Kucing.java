// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Soal 3 : Polimorfisme Universal Inclusion - Kelas Kucing

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bunyikan() {
        System.out.println(nama + " (Kucing) berbunyi: Meong!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " (Kucing) bergerak dengan melata.");
    }
}
