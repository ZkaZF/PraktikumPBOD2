import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548", "78647324", "Andi",
            LocalDate.of(1990, 5, 5),
            LocalDate.of(2015, 1, 1),
            5000000, "Fakultas Sains dan Matematika"
        );

        DosenTamu dosenTamu = new DosenTamu(
            "1234567890", "98765432", "Budi",
            LocalDate.of(1985, 3, 15),
            LocalDate.of(2020, 6, 1),
            6000000, "Fakultas Teknik",
            LocalDate.of(2027, 6, 30)
        );

        Tendik tendik = new Tendik(
            "1122334455", "Citra",
            LocalDate.of(1992, 7, 20),
            LocalDate.of(2018, 3, 1),
            4000000, "Akademik"
        );

        System.out.println("========== DOSEN TETAP ==========");
        dosenTetap.printInfo();
        System.out.println();

        System.out.println("========== DOSEN TAMU ==========");
        dosenTamu.printInfo();
        System.out.println();

        System.out.println("========== TENDIK ==========");
        tendik.printInfo();
    }
}
