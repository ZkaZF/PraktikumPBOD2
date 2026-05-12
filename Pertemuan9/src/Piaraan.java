/*  Nama File   : PiaraanArray.java
    Deskripsi   : Versi Piaraan menggunakan array biasa (tanpa Queue/LinkedList)
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 05 May 2026
*/

public class Piaraan {
    // ATRIBUT
    private int nbelm; // banyaknya elemen dalam antrian
    private Anabul[] Lanabul; // array untuk menyimpan objek Anabul
    private int front; // posisi depan antrian (untuk dequeue)
    private int kapasitas; // kapasitas maksimal array

    // METHOD
    // konstruktor untuk membuat antrian kosong dengan kapasitas awal 10
    Piaraan() {
        nbelm = 0;
        kapasitas = 10;
        Lanabul = new Anabul[kapasitas];
        front = 0;
    }

    // memperbesar kapasitas array jika penuh
    private void perbesar() {
        kapasitas = kapasitas * 2;
        Anabul[] arrayBaru = new Anabul[kapasitas];
        for (int i = 0; i < nbelm; i++) {
            arrayBaru[i] = Lanabul[front + i];
        }
        Lanabul = arrayBaru;
        front = 0;
    }

    // mengembalikan jumlah elemen dalam antrian
    int getNbelm() {
        return nbelm;
    }

    // menambahkan elemen (hewan) ke akhir antrian (manual enqueue)
    void enqueueAnabul(Anabul anabul) {
        if (front + nbelm == kapasitas) {
            perbesar();
        }
        Lanabul[front + nbelm] = anabul;
        nbelm++;
    }

    // mengecek apakah objek anabul tertentu ada dalam antrian
    boolean isMember(Anabul anabul) {
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[front + i] == anabul) {
                return true;
            }
        }
        return false;
    }

    // mengambil data anabul pertama dalam antrian (tanpa mengeluarkannya)
    Anabul getAnabul() {
        if (nbelm > 0) {
            return Lanabul[front];
        }
        return null;
    }

    // mengambil anabul pertama dan sekaligus mengeluarkannya dari antrian (manual
    // dequeue)
    Anabul dequeueAnabul() {
        if (nbelm > 0) {
            Anabul hewan = Lanabul[front];
            Lanabul[front] = null;
            front++;
            nbelm--;

            // reset front jika antrian kosong
            if (nbelm == 0) {
                front = 0;
            }
            return hewan;
        }
        return null;
    }

    // menampilkan nama-nama panggilan semua hewan dalam antrian secara berurutan
    void showAnabul() {
        System.out.println("Daftar Nama Hewan dalam Antrian (" + nbelm + " hewan):");
        for (int i = 0; i < nbelm; i++) {
            System.out.println((i + 1) + ". " + Lanabul[front + i].getNama());
        }
    }

    // menghitung banyaknya hewan dari keluarga Kucing dalam antrian
    int countKucing() {
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[front + i] instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // menghitung total bobot seluruh keluarga Kucing dalam antrian
    double bobotKucing() {
        double totalBobot = 0;
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul[front + i] instanceof Kucing) {
                Kucing kucing = (Kucing) Lanabul[front + i];
                Object bobot = kucing.getBobot();
                if (bobot instanceof Number) {
                    totalBobot += ((Number) bobot).doubleValue();
                }
            }
        }
        return totalBobot;
    }

    // menampilkan nama-nama panggilan para Anabul beserta jenis/tipe objeknya
    void showJenisAnabul() {
        System.out.println("Daftar Jenis Hewan dalam Antrian:");
        for (int i = 0; i < nbelm; i++) {
            String jenisClass = Lanabul[front + i].getClass().getSimpleName();
            System.out.println((i + 1) + ". " + Lanabul[front + i].getNama() + " - " + jenisClass);
        }
    }
}
