// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Soal 4b - 4j : Kelas Seminar + Main program utama

public class Seminar {

    // -------------------------------------------------------
    // b. Array statis (maks 100 orang) dan atribut banyakpeserta
    // -------------------------------------------------------
    private CivitasAkademika[] pesertas;
    private int banyakpeserta;

    // Konstruktor: inisialisasi array dan banyakpeserta = 0
    public Seminar() {
        pesertas = new CivitasAkademika[100];
        banyakpeserta = 0;
    }

    // -------------------------------------------------------
    // c. Fungsi countPeserta: menghitung banyaknya peserta
    // -------------------------------------------------------
    public int countPeserta() {
        return banyakpeserta;
    }

    // -------------------------------------------------------
    // d. Prosedur registrasi: menambahkan peserta (kontigu)
    // -------------------------------------------------------
    public void registrasi(CivitasAkademika peserta) {
        if (banyakpeserta < pesertas.length) {
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
            System.out.println("Peserta terdaftar: " + peserta.getNama() + " [" + peserta.getNomor() + "]");
        } else {
            System.out.println("Kapasitas seminar sudah penuh! Tidak dapat mendaftarkan: " + peserta.getNama());
        }
    }

    // -------------------------------------------------------
    // g. Prosedur tampilPeserta: menampilkan Nomor dan Nama semua peserta
    // -------------------------------------------------------
    public void tampilPeserta() {
        System.out.println("=== Daftar Peserta Seminar ===");
        System.out.printf("%-5s %-20s %-30s %-15s%n", "No.", "Nomor (NIM/NIP)", "Nama", "Jenis");
        System.out.println("-".repeat(72));
        for (int i = 0; i < banyakpeserta; i++) {
            String jenis = (pesertas[i] instanceof MahasiswaSeminar) ? "Mahasiswa" : "Dosen";
            System.out.printf("%-5d %-20s %-30s %-15s%n",
                    (i + 1), pesertas[i].getNomor(), pesertas[i].getNama(), jenis);
        }
        System.out.println("-".repeat(72));
    }

    // -------------------------------------------------------
    // h. Fungsi countMahasiswa: menghitung peserta mahasiswa dengan instanceof
    // -------------------------------------------------------
    public int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof MahasiswaSeminar) {
                jumlah++;
            }
        }
        return jumlah;
    }

    // -------------------------------------------------------
    // Main: program utama demonstrasi semua fitur
    // -------------------------------------------------------
    public static void main(String[] args) {

        // e. Buat 2 objek Dosen dan 5 objek Mahasiswa
        Dosen d1 = new Dosen("198501012010011001", "Prof. Dr. Ahmad Fauzi");
        Dosen d2 = new Dosen("199003152015041002", "Dr. Budi Raharjo");

        MahasiswaSeminar m1 = new MahasiswaSeminar("24060122140001", "Andi Saputra");
        MahasiswaSeminar m2 = new MahasiswaSeminar("24060122140002", "Siti Rahayu");
        MahasiswaSeminar m3 = new MahasiswaSeminar("24060122140003", "Doni Prasetyo");
        MahasiswaSeminar m4 = new MahasiswaSeminar("24060122140004", "Rina Wulandari");
        MahasiswaSeminar m5 = new MahasiswaSeminar("24060122140005", "Fajar Nugroho");

        // Buat objek Seminar
        Seminar seminar = new Seminar();

        // f. Uji prosedur Registrasi dengan semua 7 peserta
        System.out.println("=== (f) Registrasi Peserta Seminar ===");
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);
        System.out.println();

        // c. countPeserta
        System.out.println("=== (c) Jumlah Peserta ===");
        System.out.println("Total peserta seminar: " + seminar.countPeserta() + " orang");
        System.out.println();

        // g. tampilPeserta
        System.out.println("=== (g) Tampil Daftar Peserta ===");
        seminar.tampilPeserta();
        System.out.println();

        // h. countMahasiswa dengan instanceof
        System.out.println("=== (h) Jumlah Peserta Mahasiswa ===");
        System.out.println("Jumlah peserta mahasiswa: " + seminar.countMahasiswa() + " orang");
        System.out.println();

        // i. setWali - atur dosen wali untuk setiap mahasiswa
        System.out.println("=== (i) Set Dosen Wali ===");
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);
        System.out.println("Dosen wali telah ditetapkan untuk semua mahasiswa.");
        System.out.println();

        // j. tampilDataMahasiswa
        System.out.println("=== (j) Data Lengkap Mahasiswa ===");
        MahasiswaSeminar[] listMhs = { m1, m2, m3, m4, m5 };
        for (MahasiswaSeminar mhs : listMhs) {
            mhs.tampilDataMahasiswa();
            System.out.println();
        }

        // Renungan
        System.out.println("=== RENUNGAN: Polimorfisme ===");
        System.out.println("Polimorfisme memungkinkan satu referensi (CivitasAkademika)");
        System.out.println("merujuk ke objek dari berbagai kelas turunan (Dosen / Mahasiswa).");
        System.out.println("Saat metode dipanggil, Java secara otomatis menjalankan versi");
        System.out.println("metode yang sesuai dengan tipe objek aktual (dynamic dispatch),");
        System.out.println("sehingga kode lebih fleksibel dan mudah dikembangkan.");
    }
}
