/*  Nama File   : MTitik.java
    Deskripsi   : Berisi atribut dan method dalam class Titik 
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 20 Feb 2026
*/
public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

    }
}
