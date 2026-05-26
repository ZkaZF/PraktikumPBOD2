import java.util.ArrayList;
public class LambdaList {
    public static void main(String[] args) {
       ArrayList<String> mahasiswaList = new ArrayList<>();
         mahasiswaList.add("Budi");
            mahasiswaList.add("Siti");
            mahasiswaList.add("Rudi");
            mahasiswaList.add("Ani");

            // lambda digunakan sebagai parameter
            mahasiswaList.forEach((nama) -> System.out.println(nama));
    } 
}
