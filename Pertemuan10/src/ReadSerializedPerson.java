import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadSerializedPerson {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("person.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person = (Person) ois.readObject();
        ois.close();
        fis.close();

        System.out.println("Objek Person berhasil dibaca dari person.ser");
        System.out.println("Data terbaca: " + person);
    }
}
