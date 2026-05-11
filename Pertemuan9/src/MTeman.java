/*  Nama File   : MTeman.java
    Deskripsi   : Main class untuk demonstrasi kelas Teman (koleksi array)
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 05 May 2026
*/

public class MTeman {
    public static void main(String[] args) {
        System.out.println("========== SOAL I: KOLEKSI DENGAN ARRAY (Tanpa ArrayList) ==========\n");
        
        Teman teman = new Teman();
        
        // Menambahkan nama-nama teman (manual add)
        System.out.println(">>> Menambahkan nama-nama teman (addNama - manual):");
        teman.addNama("Budi");
        teman.addNama("Siti");
        teman.addNama("Rudi");
        teman.addNama("Ani");
        teman.addNama("Budi");
        System.out.println("5 nama telah ditambahkan ke koleksi.\n");
        
        // Menampilkan semua nama teman
        System.out.println(">>> Menampilkan semua nama teman:");
        teman.showTeman();
        System.out.println();
        
        // Mengecek member
        System.out.println(">>> Pengecekan Member:");
        System.out.println("Apakah 'Budi' ada? " + teman.isMember("Budi"));
        System.out.println("Apakah 'Joni' ada? " + teman.isMember("Joni"));
        System.out.println();
        
        // Menghitung kemunculan
        System.out.println(">>> Menghitung kemunculan (countNama):");
        System.out.println("'Budi' muncul " + teman.countNama("Budi") + " kali");
        System.out.println();
        
        // Mengubah nama
        System.out.println(">>> Mengubah nama (setNama):");
        System.out.println("Mengubah indeks 2 dari 'Rudi' menjadi 'Rafa'");
        teman.setNama(2, "Rafa");
        teman.showTeman();
        System.out.println();
        
        // Mengganti nama
        System.out.println(">>> Mengganti nama (gantiNama):");
        System.out.println("Mengganti semua 'Budi' dengan 'Bambang'");
        teman.gantiNama("Budi", "Bambang");
        teman.showTeman();
        System.out.println();
        
        // Menghapus nama (manual delete - shift array)
        System.out.println(">>> Menghapus nama (delNama - manual dengan shift):");
        System.out.println("Menghapus nama 'Ani'");
        teman.delNama("Ani");
        teman.showTeman();
        System.out.println();
        
        System.out.println("Total teman: " + teman.getNbelm());
        System.out.println();
        System.out.println("===== AKHIR SOAL I (Versi Array) =====");
    }
}
