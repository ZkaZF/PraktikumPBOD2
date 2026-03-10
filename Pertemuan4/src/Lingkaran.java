public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        this.jari = 0;
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public void getLuas() {
        double luas = Math.PI * jari * jari;
        System.out.println("Luas Lingkaran: " + luas);
    }

    public void getKeliling() {
        double keliling = 2 * Math.PI * jari;
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    @Override
    public void printInfo() {
        System.out.println("Jumlah Sisi: " + getJmlSisi());
        System.out.println("Warna: " + getWarna());
        System.out.println("Border: " + getBorder());
        System.out.println("Jari-jari: " + jari);
    }
}