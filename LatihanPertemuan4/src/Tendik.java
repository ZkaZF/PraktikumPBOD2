import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;

    public Tendik() {
        super();
        this.bidang = "";
    }

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    @Override
    protected LocalDate getTanggalPensiun() {
        LocalDate tanggalPensiun = tanggalLahir.plusYears(BUP);
        return tanggalPensiun.withDayOfMonth(1).plusMonths(1);
    }

    @Override
    protected double getTunjangan() {
        int tahunKerja = getMasaKerja().getYears();
        return 0.01 * tahunKerja * gajiPokok;
    }

    @Override
    public void printInfo() {
        int tahunKerja = getMasaKerja().getYears();
        double tunjangan = getTunjangan();

        System.out.println("NIP\t\t\t: " + nip);
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Tanggal Lahir\t\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t\t: " + formatTanggal(tmt));
        System.out.println("Jabatan\t\t\t: Tenaga Kependidikan");
        System.out.println("Bidang\t\t\t: " + bidang);
        System.out.println("Masa Kerja\t\t: " + formatMasaKerja());
        System.out.println("Tanggal Pensiun\t\t: " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok\t\t: " + formatRupiah(gajiPokok));
        System.out.println("Tunjangan\t\t: 1% x " + tahunKerja + " x " + formatRupiah(gajiPokok) + " = " + formatRupiah(tunjangan));
    }
}
