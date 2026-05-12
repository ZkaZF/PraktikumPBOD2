// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Pertemuan 8 : Generik pada Operator - Kelas OperatorGenerik

public class OperatorGenerik {

    // a. Prosedur generik Tukar
    //    Menggunakan Datum<T> sebagai wrapper karena Java
    //    bersifat pass-by-value (tidak bisa swap langsung).
    //    Dengan Datum, perubahan isi objek tetap terlihat
    //    di luar method.
    public static <T> void tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // c. Fungsi generik Bobot2
    //    Menerima dua objek keturunan Kucing<T> (T harus Number)
    //    lalu mengembalikan jumlah bobot keduanya sebagai double.
    public static <T extends Number> double bobot2(Kucing<T> a, Kucing<T> b) {
        return a.getBobot().doubleValue() + b.getBobot().doubleValue();
    }
}
