/*  Nama File   : MPiaraanArray.java
    Deskripsi   : Main class untuk demonstrasi PiaraanArray (tanpa Queue/LinkedList)
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 05 May 2026
*/

public class MPiaraan {
    public static void main(String[] args) {
        System.out.println("========== SOAL II: KOLEKSI DENGAN ARRAY (Tanpa Queue) ==========\n");

        Piaraan piaraan = new Piaraan();

        // Membuat objek hewan
        System.out.println(">>> Membuat objek-objek hewan:");
        Kucing kucing1 = new Kucing("Mimi", 3.5);
        Kucing kucing2 = new Kucing("Momo", 2.8);
        Anggora anggora1 = new Anggora("Luna", 4.0, "Putih");
        Anjing anjing1 = new Anjing("Doggy");
        Burung burung1 = new Burung("Tweety");
        System.out.println("5 objek hewan telah dibuat.\n");

        // Menambahkan hewan ke antrian (manual enqueue)
        System.out.println(">>> Menambahkan hewan ke antrian (enqueueAnabul - manual):");
        piaraan.enqueueAnabul(kucing1);
        piaraan.enqueueAnabul(anggora1);
        piaraan.enqueueAnabul(anjing1);
        piaraan.enqueueAnabul(kucing2);
        piaraan.enqueueAnabul(burung1);
        System.out.println("5 hewan telah ditambahkan ke antrian.\n");

        // Menampilkan nama hewan
        System.out.println(">>> Menampilkan nama hewan dalam antrian:");
        piaraan.showAnabul();
        System.out.println();

        // Menampilkan jenis hewan
        System.out.println(">>> Menampilkan jenis hewan:");
        piaraan.showJenisAnabul();
        System.out.println();

        // Statistik
        System.out.println(">>> Statistik:");
        System.out.println("Total hewan: " + piaraan.getNbelm());
        System.out.println("Jumlah kucing: " + piaraan.countKucing());
        System.out.println("Total bobot kucing: " + piaraan.bobotKucing() + " kg\n");

        // Mengambil hewan pertama tanpa hapus
        System.out.println(">>> Mengambil hewan pertama tanpa hapus (getAnabul):");
        Anabul hewan = piaraan.getAnabul();
        if (hewan != null) {
            System.out.println("Hewan pertama: " + hewan.getNama());
            System.out.println("Total hewan masih: " + piaraan.getNbelm());
        }
        System.out.println();

        // Dequeue (manual remove from front - shift)
        System.out.println(">>> Memanggil hewan untuk konsultasi (dequeueAnabul - manual):");
        Anabul hewanDipanggil = piaraan.dequeueAnabul();
        if (hewanDipanggil != null) {
            System.out.println("Hewan yang dipanggil: " + hewanDipanggil.getNama());
            hewanDipanggil.bunyikan();
            System.out.println("Jumlah hewan tersisa: " + piaraan.getNbelm());
        }
        System.out.println();

        // Tampilkan antrian setelah dequeue
        System.out.println(">>> Antrian setelah dequeue:");
        piaraan.showAnabul();
        System.out.println();

        // Check member setelah dequeue
        System.out.println(">>> Pengecekan member:");
        System.out.println("Apakah kucing1 masih ada? " + piaraan.isMember(kucing1));
        System.out.println("Apakah hewanDipanggil masih ada? " + piaraan.isMember(hewanDipanggil));
        System.out.println();

        System.out.println("===== AKHIR SOAL II (Versi Array) =====");
    }
}
