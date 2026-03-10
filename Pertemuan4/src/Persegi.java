public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi (double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void getLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }

    public void getKeliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
    }

    public void getDiagonal() {
        double diagonal = sisi * Math.sqrt(2);
        System.out.println("Diagonal Persegi: " + diagonal);
    }   

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
