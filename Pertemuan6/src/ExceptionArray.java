// file : ExceptionArray.java
// Deskripsi : program untuk menunjukkan penggunaan exception pada java dengan kasus array
public class ExceptionArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // Ini akan menyebabkan ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up code.. ");
        }
    }    
}
