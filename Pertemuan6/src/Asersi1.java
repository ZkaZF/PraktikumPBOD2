// file : Asersi1.java
// Deskripsi : program untuk menunjukkan penggunaan asersi pada java
public class Asersi1 {
    public static void main(String[] args) {
        int x = -5;
        if(x>0){
            System.out.println("x bilangan positif");
        } else {
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
