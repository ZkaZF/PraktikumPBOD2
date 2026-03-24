// file : AngkaSialException.java
// Deskripsi : program untuk menunjukkan penggunaan exception pada java dengan kasus angka sial
public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13");
    }
}
