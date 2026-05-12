// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Pertemuan 8 : Larik Generik - Kelas Generik Data

public class Data<T> {

    // a. Atribut: larik statis 100 elemen generik + pencacah elemen efektif
    @SuppressWarnings("unchecked")
    private T[] ruang = (T[]) new Object[100]; // larik statis 100 elemen
    private int banyak = 0;                     // banyak elemen efektif

    // b. Prosedur setIsi
    //    posisi : 1..100 (indeks manusia, bukan indeks array)
    //    elemen : objek yang akan mengisi posisi tersebut
    public void setIsi(int posisi, T elemen) {
        if (posisi < 1 || posisi > 100) {
            System.out.println("Posisi " + posisi + " tidak valid! Harus 1..100");
            return;
        }
        // Jika slot sebelumnya kosong, tambah banyak
        if (ruang[posisi - 1] == null && elemen != null) {
            banyak++;
        }
        // Jika slot diisi null (dihapus), kurangi banyak
        if (ruang[posisi - 1] != null && elemen == null) {
            banyak--;
        }
        ruang[posisi - 1] = elemen;
    }

    // c. Fungsi getIsi
    //    posisi : 1..100
    //    return : elemen generik pada posisi tersebut
    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) {
            System.out.println("Posisi " + posisi + " tidak valid! Harus 1..100");
            return null;
        }
        return ruang[posisi - 1];
    }

    // d. Fungsi getSize
    //    return : banyak elemen efektif (non-null)

    public int getSize() {
        return banyak;
    }
}
