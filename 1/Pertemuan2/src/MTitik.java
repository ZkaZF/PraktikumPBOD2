/*  Nama File   : MTitik.java
    Deskripsi   : Berisi atribut dan method dalam class Titik 
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 24 Feb 2026
*/
public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();

        Titik T2 = new Titik(-10,15);
        T2.printTitik();
        System.out.println("Jumlah objek Titik yang telah dibuat: " + Titik.getCounterTitik());
        System.out.println("Jumlah objek Titik T2 yang telah dibuat: " + T2.getCounterTitik());

        System.out.println(T1.getKuadran());
        System.out.println(T2.getKuadran());

        System.out.println("Jarak dari pusat: " + T1.getJarakPusat());
        System.out.println("Jarak dari pusat: " + T2.getJarakPusat());

        System.out.println("Jarak antara T1 dan T2: " + T1.getJarak(T2));

        System.out.println("Refleksi terhadap sumbu X: " + T1.getRefleksiX());
        System.out.println("Refleksi terhadap sumbu Y: " + T1.getRefleksiY());
        
    }
}
