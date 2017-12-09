import javax.swing.*;

public class Contact {

    private String name;
    private String address;
    private String phoneNo;
    private String email;

    public Contact() { }

    public Contact(String name, String address, String phoneNo, String email) {
        this.setName(name);
        this.setAddress(address);
        this.setPhoneNo(phoneNo);
        this.setEmail(email);
    }

	public String getName() { return name;	}

	public void setName(String name) { this.name = name; }

	public String getAddress() { return address; }

	public void setAddress(String address) { this.address = address; }

	public String getPhoneNo() { return phoneNo; }

	public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }

    public String getEmail() { return this.email; }

    public void setEmail(String email) { this.email = email; }

}
