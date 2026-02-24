/*  Nama File   : MGaris.java
    Deskripsi   : Main class untuk menggunakan class Garis
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 24 Feb 2026
*/
public class MGaris {
    public static void main(String[] args) {
        // membuat garis dengan konstruktor tanpa parameter
        Garis G1 = new Garis();
        G1.printGaris();
        System.out.println("Panjang G1: " + G1.getPanjang());

        // membuat garis dengan konstruktor berparameter
        Titik A = new Titik(0, 0);
        Titik B = new Titik(3, 4);
        Garis G2 = new Garis(A, B);
        G2.printGaris();
        System.out.println("Panjang G2: " + G2.getPanjang());

        // menggunakan setter
        G1.setTitikAwal(new Titik(1, 2));
        G1.setTitikAkhir(new Titik(4, 6));
        G1.printGaris();
        System.out.println("Panjang G1 setelah diubah: " + G1.getPanjang());

        // menampilkan jumlah garis yang telah dibuat
        System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}
