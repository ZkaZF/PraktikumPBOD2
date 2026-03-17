import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public abstract class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    private static final String[] NAMA_BULAN = {
        "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
        "Juli", "Agustus", "September", "Oktober", "November", "Desember"
    };

    public Pegawai() {
        this.nip = "";
        this.nama = "";
        this.tanggalLahir = LocalDate.now();
        this.tmt = LocalDate.now();
        this.gajiPokok = 0;
    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    protected String formatTanggal(LocalDate date) {
        return date.getDayOfMonth() + " " + NAMA_BULAN[date.getMonthValue()] + " " + date.getYear();
    }

    protected String formatRupiah(double amount) {
        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        return "Rp " + nf.format(amount);
    }

    protected Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    protected String formatMasaKerja() {
        Period masaKerja = getMasaKerja();
        return masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan";
    }

    protected abstract LocalDate getTanggalPensiun();

    protected abstract double getTunjangan();

    public abstract void printInfo();
}
