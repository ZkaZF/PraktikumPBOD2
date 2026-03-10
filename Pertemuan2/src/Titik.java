/*  Nama File   : Titik.java
    Deskripsi   : Berisi atribut dan method dalam class Titik 
    Pembuat     : Azka Wayasy Al Hafizh - 24060124140161
    Tanggal     : 24 Feb 2026
*/
public class Titik {
    //  ATRIBUT
    double absis; 
    double ordinat; 
    static int counterTitik = 0; // atribut untuk menghitung jumlah objek Titik yang dibuat

    // METHOD
    // konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0 ;
        ordinat = 0;
        counterTitik++; // setiap kali objek Titik dibuat, counterTitik akan bertambah 1
    }

    // konstruktor untuk membuat titik (x,y)
    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    // method untuk mendapatkan jumlah objek Titik yang telah dibuat
    static int getCounterTitik() {
        return counterTitik; 
    }

    // mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // menentukan kuadran titik
    String getKuadran(){
        if (absis > 0 && ordinat > 0){
            return "Titik berada pada kuadran I";
        } else if (absis < 0 && ordinat > 0){
            return "Titik berada pada kuadran II";
        } else if (absis < 0 && ordinat < 0){
            return "Titik berada pada kuadran III";
        } else if (absis > 0 && ordinat < 0){
            return "Titik berada pada kuadran IV";
        } else if (absis == 0 && ordinat != 0){
            return "Titik berada pada sumbu Y";
        } else if (absis != 0 && ordinat == 0){
            return "Titik berada pada sumbu X";
        } else {
            return "Titik berada pada titik asal (0,0)";
        }
    }

    // menghitung jarak titik dari pusat
    double getJarakPusat(){
    return Math.sqrt(absis * absis + ordinat * ordinat);
}
    // menghitung jarak titik T dari titik lain
    double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis - T.absis, 2) + Math.pow(ordinat - T.ordinat, 2));
    }

    void refleksiX(){
    ordinat = -ordinat;
    }

    void refleksiY(){
        absis = -absis;
    }
    
    double getRefleksiX(){
        return -ordinat;
    }

    double getRefleksiY(){
        return -absis;
    }
    // mencetak koordinat titik 
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}
