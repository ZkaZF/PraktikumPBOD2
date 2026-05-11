// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Pertemuan 8 : Generik pada Class - Kelas Generik Datum

public class Datum<T> {
    private T isi; // atribut isi bertipe generik

    // Constructor
    public Datum(T isi) {
        this.isi = isi;
    }

    // Fungsi: mengembalikan nilai isi
    public T getIsi() {
        return isi;
    }

    // Prosedur: mengubah isi menjadi isibaru
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }

    @Override
    public String toString() {
        return "Datum{isi=" + isi + "}";
    }
}
