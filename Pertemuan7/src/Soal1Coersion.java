// NIM    : 24060124140161
// Nama   : Azka Wayasy Al Hafizh
// Soal 1 : Polimorfisme Ad Hoc Coersion

public class Soal1Coersion {
    public static void main(String[] args) {

        // a. Ilustrasi polimorfisme coersion: nilai integer 65 ditampilkan sebagai
        // berbagai tipe
        System.out.println("=== (a) Polimorfisme Coersion: nilai 65 ===");
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt; // casting int -> char
        double nilaiDouble = (double) nilaiInt; // casting int -> double
        System.out.println("Sebagai int    : " + nilaiInt);
        System.out.println("Sebagai char   : " + nilaiChar);
        System.out.println("Sebagai double : " + nilaiDouble);

        // b. Nilai real dikembalikan ke integer dalam variabel berbeda
        System.out.println("\n=== (b) Real dikembalikan ke Integer ===");
        double real = 65.7;
        int kembaliInt = (int) real; // casting double -> int (truncate)
        System.out.println("Nilai real       : " + real);
        System.out.println("Kembali ke int   : " + kembaliInt);

        // c. String X="1234", Y="5678", S=konkatenasi, Z=penjumlahan
        System.out.println("\n=== (c) String X dan Y ===");
        String X = "1234";
        String Y = "5678";
        String S = X + Y; // konkatenasi String
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // penjumlahan angka
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("S (konkatenasi) = " + S);
        System.out.println("Z (penjumlahan) = " + Z);

        // d. String P="12.34", Q="56.78", R=konkatenasi, D=penjumlahan
        System.out.println("\n=== (d) String P dan Q ===");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; // konkatenasi String
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); // penjumlahan angka
        System.out.println("P = " + P);
        System.out.println("Q = " + Q);
        System.out.println("R (konkatenasi) = " + R);
        System.out.println("D (penjumlahan) = " + D);

        // e. Objek Integer A dari konversi S
        System.out.println("\n=== (e) Integer A dari konversi S ===");
        Integer A = Integer.parseInt(S);
        System.out.println("A = " + A);

        // f. Objek String T dari konversi A
        System.out.println("\n=== (f) String T dari konversi A ===");
        String T = A.toString();
        System.out.println("T = " + T);
    }
}
