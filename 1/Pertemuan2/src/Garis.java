/*  Nama File   : Garis.java
    Deskripsi   : Berisi atribut dan method dalam class Garis
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 24 Feb 2026
*/
public class Garis {
    // ATRIBUT
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    // METHOD
    // konstruktor tanpa parameter, titik awal (0,0) dan titik akhir (1,1)
    Garis(){
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // konstruktor dengan parameter titik awal dan titik akhir
    Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // getter titik awal
    Titik getTitikAwal(){
        return titikAwal;
    }

    // getter titik akhir
    Titik getTitikAkhir(){
        return titikAkhir;
    }

    // getter counterGaris
    static int getCounterGaris(){
        return counterGaris;
    }

    // setter titik awal
    void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    // setter titik akhir
    void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }


    // mencetak informasi garis
    void printGaris(){
        System.out.println("Garis dari (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() +
                           ") ke (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }
}
