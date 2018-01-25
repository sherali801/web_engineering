package bean;


import java.io.Serializable;

public class UserBean implements Serializable {
    
    private String name;
    private String mobile;
    private String email;
    private String logInName;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogInName() {
        return logInName;
    }

    public void setLogInName(String logInName) {
        this.logInName = logInName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
