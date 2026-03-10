public class MBangunDatar {
    public static void main(String[] args) {
  
        Persegi persegi = new Persegi(5, "merah", "hitam");
        System.out.println("Persegi");
        persegi.printInfo();
        persegi.getLuas();
        persegi.getKeliling();
        persegi.getDiagonal();
    
        System.out.println();
        Lingkaran lingkaran = new Lingkaran(7, "biru", "hitam");
        System.out.println("Lingkaran");
        lingkaran.printInfo();
        lingkaran.getLuas();
        lingkaran.getKeliling();
    }
}
