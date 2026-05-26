public class MainDAO {
    public static void main(String[] args) throws Exception {
        DAOManager manager = DAOManager.getInstance();
        personDAO dao = manager.getPersonDAO();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Masukkan nama Person baru: ");
        String name = scanner.nextLine();

        Person pBaru = new Person(name);
        dao.save(pBaru);

        System.out.println("Data '" + name + "' berhasil disimpan ke database!");
        scanner.close();
    }
}
