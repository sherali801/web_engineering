package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenericDAO {
    
    private static final String USERNAME = "sherali";
    private static final String PASSWORD = "1399";
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost/Lab13";
    protected static Connection connection = null;
    
    public GenericDAO() {
        if (connection == null) {
            configureConnection();
        }
    }
    
    private void configureConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(GenericDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
