import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map untuk menyimpan NIM (key) dan nama mahasiswa (value)
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("123456", "Budi");
        mahasiswaMap.put("123457", "Siti");
        mahasiswaMap.put("123458", "Rudi");
        mahasiswaMap.put("123459", "Ani");

        System.out.println("=== Daftar Mahasiswa ===");
        // Menggunakan lambda dengan forEach untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + " | Nama: " + nama));
    }
}
