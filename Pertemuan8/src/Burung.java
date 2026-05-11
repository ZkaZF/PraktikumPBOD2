// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Soal 3 : Polimorfisme Universal Inclusion - Kelas Burung

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bunyikan() {
        System.out.println(nama + " (Burung) berbunyi: Cuit!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " (Burung) bergerak dengan terbang.");
    }
}
