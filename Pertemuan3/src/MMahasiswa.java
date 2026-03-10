/*  Nama File   : Mahasiswa.java
    Deskripsi   : Berisi Main Mahasiswa
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 3 Maret 2026
*/
public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("234","Citra","Informatika");
        Dosen D1 = new Dosen("123","Andi","Informatika");
        Kendaraan K1 = new Kendaraan("A 1144 NA", "Mobil");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.printDetailMHS();
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS: " + M1.getJumlahSKS());
    }
}
