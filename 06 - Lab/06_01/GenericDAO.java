import java.sql.*;

public class GenericDAO {

	private static final String USERNAME = "";
	private static final String PASSWORD = "";
	private static final String CONN_STRING = "";
	protected static Connection conn = null;

	public GenericDAO() {
		if (conn == null) {
			configureConnection();
		}
	}

	private void configureConnection() {
		try {
			conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
