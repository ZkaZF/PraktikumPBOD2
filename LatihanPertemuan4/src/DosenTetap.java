import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String nidn;
    private static final int BUP = 65;

    public DosenTetap() {
        super();
        this.nidn = "";
    }

    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir,
                      LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    @Override
    protected LocalDate getTanggalPensiun() {
        LocalDate tanggalPensiun = tanggalLahir.plusYears(BUP);
        return tanggalPensiun.withDayOfMonth(1).plusMonths(1);
    }

    @Override
    protected double getTunjangan() {
        int tahunKerja = getMasaKerja().getYears();
        return 0.02 * tahunKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        int tahunKerja = getMasaKerja().getYears();
        double tunjangan = getTunjangan();

        System.out.println("NIP\t\t\t: " + nip);
        System.out.println("NIDN\t\t\t: " + nidn);
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tanggal Lahir\t\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t\t: " + formatTanggal(tmt));
        System.out.println("Jabatan\t\t\t: Dosen Tetap");
        System.out.println("Fakultas\t\t: " + fakultas);
        System.out.println("Masa Kerja\t\t: " + formatMasaKerja());
        System.out.println("Tanggal Pensiun\t\t: " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok\t\t: " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan\t\t: 2% x " + tahunKerja + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(tunjangan));
    }
}
