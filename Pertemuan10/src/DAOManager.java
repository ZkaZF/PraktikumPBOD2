public class DAOManager {
    private static DAOManager instance;
    private personDAO personDAO;

    private DAOManager() {
        personDAO = new MySQLPersonDAO();
    }

    public static DAOManager getInstance() {
        if (instance == null) {
            instance = new DAOManager();
        }
        return instance;
    }

    public personDAO getPersonDAO() {
        return personDAO;
    }
}
