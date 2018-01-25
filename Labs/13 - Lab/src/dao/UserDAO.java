package dao;

import bean.UserBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO extends GenericDAO {
    
    public boolean create(UserBean user){
        String sql = "INSERT INTO user ("
                + "name, mobile, email, login_name, password"
                + ") VALUES ("
                + "?, ?, ?, ?, ?"
                + ")";
        boolean flag = false;
        PreparedStatement preStmt = null;
        try {
            preStmt = connection.prepareStatement(sql);
            preStmt.setString(1, user.getName());
            preStmt.setString(2, user.getMobile());
            preStmt.setString(3, user.getEmail());
            preStmt.setString(4, user.getLogInName());
            preStmt.setString(5, user.getPassword());
            if (preStmt.executeUpdate() == 1) {
                flag = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (preStmt != null) {
                try {
                    preStmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return flag;
    }
    
    public UserBean read(String logInName) {
        String sql = "SELECT * FROM user WHERE login_name = ?";
        UserBean user = null;
        PreparedStatement preStmt = null;
        ResultSet rs = null;
        try {
            preStmt = connection.prepareStatement(sql);
            preStmt.setString(1, logInName);
            rs = preStmt.executeQuery();
            while (rs.next()) {
                user = new UserBean();
                user.setName(rs.getString("name"));
                user.setMobile(rs.getString("mobile"));
                user.setEmail(rs.getString("email"));
                user.setLogInName(rs.getString("login_name"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (preStmt != null) {
                try {
                    preStmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return user;
    }
    
}
