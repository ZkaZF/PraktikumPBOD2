import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializePerson {
    public static void main(String[] args) throws Exception {
        Person person = new Person(1, "John Doe");

        FileOutputStream fos = new FileOutputStream("person.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.close();
        fos.close();

        System.out.println("Objek Person berhasil diserialisasi ke person.ser");
        System.out.println("Data tersimpan: id=" + person.getId() + ", name=" + person.getName());
    }
}
