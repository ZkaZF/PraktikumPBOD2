/*  Nama File   : Mahasiswa.java
    Deskripsi   : Berisi atribut dan method dalam class Mahasiswa
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 3 Maret 2026
*/
import java.util.ArrayList;
public class Mahasiswa {
    // ATRIBUT
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // METHOD

    // konstruktor 
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
    }

    // konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    public void addMatKul(MataKuliah matkul){
        this.listMatKul.add(matkul);
    }
    
    
    public int getJumlahSKS(){
        int totalSks = 0;
        for (int i = 0; i < listMatKul.size(); i++){
            totalSks += listMatKul.get(i).getSks();
        }
        return totalSks;
    }
    
    public int getJumlahMatKul(){
        return listMatKul.size();
    }
    
    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    public void printDetailMHS(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for (i = 0; i < listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNama());
        }
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
}
