/*  Nama File   : Kendaraan.java
    Deskripsi   : Berisi atribut dan method dalam class Kendaraan
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 3 Maret 2026
*/
public class Kendaraan {
    // ATRIBUT
    private String noPlat;
    private String jenis; 

    // METHOD

    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        if(jenis=="Mobil" || jenis=="Motor"){
            this.jenis = jenis;
        } else {
            this.jenis = "Jenis kendaraan tidak valid";
        }
    }

    // Selektor (Getter)
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    // Mutator (Setter)
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        if(jenis=="Mobil" || jenis=="Motor"){
            this.jenis = jenis;
        } else {
            this.jenis = "Jenis kendaraan tidak valid";
        }
    }
}
