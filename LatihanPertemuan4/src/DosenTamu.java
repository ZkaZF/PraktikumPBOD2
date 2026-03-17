import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu() {
        super();
        this.nidk = "";
        this.tanggalAkhirKontrak = LocalDate.now();
    }

    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir,
                     LocalDate tmt, double gajiPokok, String fakultas, LocalDate tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public LocalDate getTanggalAkhirKontrak() {
        return tanggalAkhirKontrak;
    }

    public void setTanggalAkhirKontrak(LocalDate tanggalAkhirKontrak) {
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    @Override
    protected LocalDate getTanggalPensiun() {
        return tanggalAkhirKontrak;
    }

    protected long getSisaKontrakBulan() {
        return ChronoUnit.MONTHS.between(LocalDate.now(), tanggalAkhirKontrak);
    }

    @Override
    protected double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        double tunjangan = getTunjangan();

        System.out.println("NIP\t\t\t: " + nip);
        System.out.println("NIDK\t\t\t: " + nidk);
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tanggal Lahir\t\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t\t: " + formatTanggal(tmt));
        System.out.println("Jabatan\t\t\t: Dosen Tamu");
        System.out.println("Fakultas\t\t: " + fakultas);
        System.out.println("Masa Kerja\t\t: " + formatMasaKerja());
        System.out.println("Kontrak Berakhir\t: " + formatTanggal(tanggalAkhirKontrak) + " (" + getSisaKontrakBulan() + " bulan lagi)");
        System.out.println("Gaji Pokok\t\t: " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan\t\t: 2,5% x " + formatRupiah(gajiPokok) + " = " + formatRupiah(tunjangan));
    }
}
