interface IDiskon {
    double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        // tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3); // diskon 30%
            }
        };
        // dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4); // diskon 40%

        // dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1); // diskon 10%
            };
        
        System.out.println("Harga setelah diskon Merdeka: " + diskonMerdeka.hitungDiskon(100000));
        System.out.println("Harga setelah diskon Lebaran: " + diskonLebaran.hitungDiskon(100000));
        System.out.println("Harga setelah diskon Biasa: " + diskonBiasa.hitungDiskon(100000));
    }    
}

