/*  Nama File   : TemanArray.java
    Deskripsi   : Versi Teman menggunakan array biasa (tanpa ArrayList)
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 05 May 2026
*/

public class Teman {
    // ATRIBUT
    private int nbelm; // banyaknya elemen dalam koleksi
    private String[] Lnama; // array untuk menyimpan nama-nama teman
    private int kapasitas; // kapasitas maksimal array

    // METHOD
    // konstruktor untuk membuat koleksi teman kosong dengan kapasitas awal 10
    Teman() {
        nbelm = 0;
        kapasitas = 10;
        Lnama = new String[kapasitas];
    }

    // konstruktor dengan kapasitas awal yang ditentukan
    Teman(int kapasitas) {
        nbelm = 0;
        this.kapasitas = kapasitas;
        Lnama = new String[kapasitas];
    }

    // memperbesar kapasitas array jika penuh
    private void perbesar() {
        kapasitas = kapasitas * 2;
        String[] arrayBaru = new String[kapasitas];
        for (int i = 0; i < nbelm; i++) {
            arrayBaru[i] = Lnama[i];
        }
        Lnama = arrayBaru;
    }

    // mengembalikan jumlah elemen dalam koleksi
    int getNbelm() {
        return nbelm;
    }

    // mengembalikan nama teman pada indeks tertentu
    String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama[indeks];
        }
        return null;
    }

    // mengubah nama teman pada indeks tertentu
    void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama[indeks] = nama;
        }
    }

    // menambahkan nama teman baru ke dalam koleksi (manual add)
    void addNama(String nama) {
        if (nbelm == kapasitas) {
            perbesar();
        }
        Lnama[nbelm] = nama;
        nbelm++;
    }

    // menghapus nama teman tertentu dari koleksi (manual remove)
    void delNama(String nama) {
        int indeks = -1;
        // cari indeks nama yang akan dihapus
        for (int i = 0; i < nbelm; i++) {
            if (Lnama[i].equals(nama)) {
                indeks = i;
                break;
            }
        }

        // jika nama ditemukan, hapus dengan shift ke kiri
        if (indeks != -1) {
            for (int i = indeks; i < nbelm - 1; i++) {
                Lnama[i] = Lnama[i + 1];
            }
            Lnama[nbelm - 1] = null;
            nbelm--;
        }
    }

    // mengecek apakah nama tertentu ada dalam koleksi
    boolean isMember(String nama) {
        for (int i = 0; i < nbelm; i++) {
            if (Lnama[i].equals(nama)) {
                return true;
            }
        }
        return false;
    }

    // mengganti nama teman dengan nama baru
    void gantiNama(String nama, String namabaru) {
        for (int i = 0; i < nbelm; i++) {
            if (Lnama[i].equals(nama)) {
                Lnama[i] = namabaru;
            }
        }
    }

    // menghitung berapa kali nama tertentu muncul dalam koleksi
    int countNama(String nama) {
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lnama[i].equals(nama)) {
                count++;
            }
        }
        return count;
    }

    // menampilkan semua nama teman dalam Lnama
    void showTeman() {
        System.out.println("Daftar Nama Teman (" + nbelm + " teman):");
        for (int i = 0; i < nbelm; i++) {
            System.out.println((i + 1) + ". " + Lnama[i]);
        }
    }
}
