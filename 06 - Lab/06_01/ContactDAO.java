import java.sql.*;
import java.util.*;
import javax.swing.*;

public class ContactDAO extends GenericDAO {

    private String table;
	private ArrayList<Contact> contacts;

	public ContactDAO() {
        table = "contact";
		contacts = new ArrayList<Contact>();
		read();
	}

	public ArrayList<Contact> getContacts() { return contacts; }

	public boolean create(Contact contact) {
		String sql = "INSERT INTO " + table + " ("
				+ "name, address, phone_no, email"
				+ ") VALUES ("
				+ "?, ?, ?, ?"
				+ ")";
		boolean flag = false;
		try {
			PreparedStatement preStmt = conn.prepareStatement(sql);
			preStmt.setString(1, contact.getName());
			preStmt.setString(2, contact.getAddress());
			preStmt.setString(3, contact.getPhoneNo());
			preStmt.setString(4, contact.getEmail());
			flag = (preStmt.executeUpdate() == 1) ? true : false;
			preStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public void read() {
		String sql = "SELECT * FROM " + table;
		Contact contact = null;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			contacts.clear();
			while (rs.next()) {
				contact = new Contact();
				contact.setName(rs.getString("name"));
				contact.setAddress(rs.getString("address"));
				contact.setPhoneNo(rs.getString("phone_no"));
				contact.setEmail(rs.getString("email"));
				contacts.add(contact);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Contact read(String name) {
		String sql = "SELECT * FROM " + table + " WHERE name = ?";
		Contact contact = null;
		try {
			PreparedStatement preStmt = conn.prepareStatement(sql);
			preStmt.setString(1, name);
			ResultSet rs = preStmt.executeQuery();
			while (rs.next()) {
				contact = new Contact();
				contact.setName(rs.getString("name"));
				contact.setAddress(rs.getString("address"));
				contact.setPhoneNo(rs.getString("phone_no"));
				contact.setEmail(rs.getString("email"));
			}
			rs.close();
			preStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contact;
	}

	public boolean update(String searchName, Contact contact) {
		String sql = "UPDATE " + table + " SET "
				+ "name = ?, "
				+ "address = ?, "
				+ "phone_no = ?, "
				+ "email = ? "
				+ "WHERE name = ?";
		boolean flag = false;
		try {
			PreparedStatement preStmt = conn.prepareStatement(sql);
			preStmt.setString(1, contact.getName());
			preStmt.setString(2, contact.getAddress());
			preStmt.setString(3, contact.getPhoneNo());
			preStmt.setString(4, contact.getEmail());
			preStmt.setString(5, searchName);
			flag = (preStmt.executeUpdate() > 0) ? true : false;
			preStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean delete(String name) {
		String sql = "DELETE FROM " + table + " WHERE name = ?";
		boolean flag = false;
    	try {
			PreparedStatement preStmt = conn.prepareStatement(sql);
			preStmt.setString(1, name);
			flag = (preStmt.executeUpdate() > 0) ? true : false;
			preStmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return flag;
	}

}
