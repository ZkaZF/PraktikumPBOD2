public class MainDAO {
    public static void main(String[] args) throws Exception {
        DAOManager manager = DAOManager.getInstance();
        personDAO dao = manager.getPersonDAO();

        Person p1 = new Person("Alice");
        dao.save(p1);

        Person p2 = new Person("Bob");
        dao.save(p2);

        Person p3 = new Person("Charlie");
        dao.save(p3);

        System.out.println("Data berhasil disimpan ke database!");
    }
}
